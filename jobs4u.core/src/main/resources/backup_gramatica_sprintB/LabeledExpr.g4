grammar LabeledExpr;
//Note that capitalization validation is necessary because toLowercase the whole file WILL obviouslly lower case user text which is no bueno



start: header requirements? interview footer;

footer: TOPIC_TOKEN FOOTER score_definition END_SATEMENT interview_conduct END_SATEMENT;

interview_conduct: INTERVIEW SHOULD_BE CONDUCTED IN order ORDER;


order: order_atomic COMA_TOKEN order
     | order_atomic
     ;

order_atomic: ORDER_TYPE ORDER_METHOD?;


score_definition: PASSING RESULTS MUST_SCORE passingScore=Decimal outstandingClause?;

outstandingClause: COMA_TOKEN OUTSTANDING RESULTS MUST_SCORE outstandingResults=Decimal;


requirements: TOPIC_TOKEN REQUIREMENTS requirements_body;

requirements_body: requirements_atomic requirements_body    //Eventhough left recursion is supported by ANTLR4 let's not do that for compatibility issues with other parsers
                 | requirements_atomic
                 ;

requirements_atomic: ENTRY_TOKEN requirementName=String AS requirementsType END_SATEMENT ;

requirementsType: 'text' (MAY_BE String)?
                | 'number' MAY_BE Decimal
                | 'multiple' MAY_BE 'into' '[' arr ']'
                | 'yes/no' MAY_BE ('yes'|'no')
                ;

arr: arr COMA_TOKEN String
   | String
   ;

interview: TOPIC_TOKEN INTERVIEW interview_body;

interview_body: interview_atomic interview_body
              | interview_atomic
              ;

interview_atomic: ENTRY_TOKEN (true_false | short | single_choice | multiple_choice | int_q | real_q | date_q | time_q | scale_q) END_SATEMENT;

true_false: TRUE_FALSE QUESTION WITH ID questionId=String BEING questionPrompt=String WITH DIFFICULTY OF questionDifficulty=Decimal END_SATEMENT
ITS_VALIDATION IS_DEFINED AS (TRUE|FALSE) AWARDING questionPoints=Decimal;

short: SHORT_TEXT QUESTION WITH ID questionId=String BEING questionPrompt=String WITH DIFFICULTY OF questionDifficulty=Decimal END_SATEMENT
ITS_VALIDATION IS_DEFINED AS questionCorrection=String OF TYPE ('literal' | 'regex') AWARDING questionPoints=Decimal;

single_choice: SINGLE_CHOICE QUESTION WITH ID questionId=String BEING questionPrompt=String WITH DIFFICULTY OF questionDifficulty=Decimal END_SATEMENT
ITS_VALIDATION IS_DEFINED AS correctChoice=String FROM choices=String+ AWARDING questionPoints=Decimal;

multiple_choice: MULTIPLE_CHOICE QUESTION WITH ID questionId=String BEING questionPrompt=String WITH DIFFICULTY OF questionDifficulty=Decimal END_SATEMENT
ITS_VALIDATION IS_DEFINED AS correctChoices=c_choices FROM choices=String+ AWARDING questionPoints=Decimal;

c_choices: choice choice+;

choice: '(' String COMA_TOKEN Decimal ')';

int_q: INTEGER_NUMBER QUESTION WITH ID questionId=String BEING questionPrompt=String WITH DIFFICULTY OF questionDifficulty=Decimal END_SATEMENT
       ITS_VALIDATION IS_DEFINED AS questionCorrection=Decimal AWARDING questionPoints=Decimal;

real_q: REAL_NUMBER QUESTION WITH ID questionId=String BEING questionPrompt=String WITH DIFFICULTY OF questionDifficulty=Decimal END_SATEMENT
        ITS_VALIDATION IS_DEFINED AS questionCorrection=Real AWARDING questionPoints=Decimal;

date_q: DATE QUESTION WITH ID questionId=String BEING questionPrompt=String WITH DIFFICULTY OF questionDifficulty=Decimal END_SATEMENT
             ITS_VALIDATION IS_DEFINED AS questionCorrection=String OF TYPE format=String AWARDING questionPoints=Decimal;

time_q: TIME QUESTION WITH ID questionId=String BEING questionPrompt=String WITH DIFFICULTY OF questionDifficulty=Decimal END_SATEMENT
             ITS_VALIDATION IS_DEFINED AS questionCorrection=String OF TYPE format=String AWARDING questionPoints=Decimal;

scale_q: SCALE QUESTION WITH ID questionId=String BEING questionPrompt=String WITH DIFFICULTY OF questionDifficulty=Decimal END_SATEMENT
                     ITS_VALIDATION IS_DEFINED AS questionCorrection=Decimal BETWEEN lowerBound=Decimal AND higherBound=Decimal AWARDING questionPoints=Decimal;

header: CREATE INTERVIEW_MODEL interviewName=String FOR_JOB jobOpeningReference=String AS FOLLOWS END_SATEMENT;






//Categories

fragment CommentBody: ~('\n')*;

FOOTER: 'footer';
INTERVIEW: 'interview';
REQUIREMENTS: 'requirements';
CREATE: 'create';
PASSING: 'passing';
QUESTION: 'question';

//

//Semantic tokens, soul of the language and the readability to

AND: 'and';
AS: 'as';
AWARDING: 'awarding';
BEING: 'being';
BETWEEN: 'between';
CONDUCTED: 'conducted';
DIFFICULTY: 'difficulty';
FALSE: 'false';
FOLLOWS: 'follows';
FOR_JOB: 'for job opening';
FROM: 'from';
IN: 'in';
INTERVIEW_MODEL: 'interview model';
IS_DEFINED: 'is defined';
ITS_VALIDATION: 'its validation'; //Note how more necessary work is needed to understand the parsing vs the fragment approach
MAY_BE: 'may be';
MUST_SCORE: 'must score';
OF:'of';
OUTSTANDING: 'outstanding';
ORDER: 'order';
RESULTS: 'results';
SHOULD_BE:'should be';
TRUE: 'true';
TYPE: 'type';
WITH: 'with';

//

//Syntax tokens, sugar for the language
TOPIC_TOKEN: '-';
COMA_TOKEN: ',';
ENTRY_TOKEN: '->';
END_SATEMENT: ';';
String: '"' ~'"'+ '"';
Decimal: '0'|[1-9][0-9]*;
Real: Decimal ('.'|COMA_TOKEN) ('0' | [0-9]*[1-9]);

ORDER_TYPE: ('random'|'priority'|'difficulty');
ORDER_METHOD: ('ascending'|'descending');




//


//Skip comments or structural tokens.
COMMENT: '//' CommentBody '\r'?'\n' -> skip;
WS: [ \t\r\n]->skip;
//


TRUE_FALSE: 'true/false';
SHORT_TEXT: 'short text';
SINGLE_CHOICE: 'single choice';
MULTIPLE_CHOICE: 'multiple choice';
INTEGER_NUMBER: 'integer number';
REAL_NUMBER: 'real number';
DATE: 'date';
TIME: 'time';
SCALE: 'scale';
ID: 'id';