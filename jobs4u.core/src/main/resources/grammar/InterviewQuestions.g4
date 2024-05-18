grammar InterviewQuestions;

questions: question+ ;
question: true_false | short | single_choice | multiple_choice | int_q | real_q | date_q | time_q | scale_q ;

true_false: 'TRUE_FALSE' 'QUESTION' 'WITH' 'ID' questionId=String 'BEING' questionPrompt=String 'WITH' 'DIFFICULTY' 'OF' questionDifficulty=Decimal 'END_STATEMENT'
           'ITS_VALIDATION' 'IS_DEFINED' 'AS' ('TRUE'|'FALSE') 'AWARDING' questionPoints=Decimal ;

short: 'SHORT_TEXT' 'QUESTION' 'WITH' 'ID' questionId=String 'BEING' questionPrompt=String 'WITH' 'DIFFICULTY' 'OF' questionDifficulty=Decimal 'END_STATEMENT'
       'ITS_VALIDATION' 'IS_DEFINED' 'AS' questionCorrection=String 'OF' 'TYPE' ('literal' | 'regex') 'AWARDING' questionPoints=Decimal ;

single_choice: 'SINGLE_CHOICE' 'QUESTION' 'WITH' 'ID' questionId=String 'BEING' questionPrompt=String 'WITH' 'DIFFICULTY' 'OF' questionDifficulty=Decimal 'END_STATEMENT'
               'ITS_VALIDATION' 'IS_DEFINED' 'AS' correctChoice=String 'FROM' choices=String+ 'AWARDING' questionPoints=Decimal ;

multiple_choice: 'MULTIPLE_CHOICE' 'QUESTION' 'WITH' 'ID' questionId=String 'BEING' questionPrompt=String 'WITH' 'DIFFICULTY' 'OF' questionDifficulty=Decimal 'END_STATEMENT'
                 'ITS_VALIDATION' 'IS_DEFINED' 'AS' correctChoices=c_choices 'FROM' choices=String+ 'AWARDING' questionPoints=Decimal ;

c_choices: choice (COMA_TOKEN choice)* ;
choice: '(' String COMA_TOKEN Decimal ')' ;

int_q: 'INTEGER_NUMBER' 'QUESTION' 'WITH' 'ID' questionId=String 'BEING' questionPrompt=String 'WITH' 'DIFFICULTY' 'OF' questionDifficulty=Decimal 'END_STATEMENT'
       'ITS_VALIDATION' 'IS_DEFINED' 'AS' questionCorrection=Decimal 'AWARDING' questionPoints=Decimal ;

real_q: 'REAL_NUMBER' 'QUESTION' 'WITH' 'ID' questionId=String 'BEING' questionPrompt=String 'WITH' 'DIFFICULTY' 'OF' questionDifficulty=Decimal 'END_STATEMENT'
        'ITS_VALIDATION' 'IS_DEFINED' 'AS' questionCorrection=Real 'AWARDING' questionPoints=Decimal ;

date_q: 'DATE' 'QUESTION' 'WITH' 'ID' questionId=String 'BEING' questionPrompt=String 'WITH' 'DIFFICULTY' 'OF' questionDifficulty=Decimal 'END_STATEMENT'
             'ITS_VALIDATION' 'IS_DEFINED' 'AS' questionCorrection=String 'OF' 'TYPE' format=String 'AWARDING' questionPoints=Decimal ;

time_q: 'TIME' 'QUESTION' 'WITH' 'ID' questionId=String 'BEING' questionPrompt=String 'WITH' 'DIFFICULTY' 'OF' questionDifficulty=Decimal 'END_STATEMENT'
             'ITS_VALIDATION' 'IS_DEFINED' 'AS' questionCorrection=String 'OF' 'TYPE' format=String 'AWARDING' questionPoints=Decimal ;

scale_q: 'SCALE' 'QUESTION' 'WITH' 'ID' questionId=String 'BEING' questionPrompt=String 'WITH' 'DIFFICULTY' 'OF' questionDifficulty=Decimal 'END_STATEMENT'
                     'ITS_VALIDATION' 'IS_DEFINED' 'AS' questionCorrection=Decimal 'BETWEEN' lowerBound=Decimal 'AND' higherBound=Decimal 'AWARDING' questionPoints=Decimal ;

String: '"' ~'"'+ '"' ;
Decimal: '0'|[1-9][0-9]* ;
Real: Decimal ('.'|',') ('0' | [0-9]*[1-9]) ;
COMA_TOKEN: ',' ;
WS: [ \t\n\r]+ -> skip ;
