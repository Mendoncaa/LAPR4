grammar InterviewQuestions;


start: header requirement+ EOF;


header:  text=STRING;


requirement: id=INTEGER 'RQ: ' requirementContent=STRING reqType;




reqType: trueFalseReq
                | shortAReq
                | intReq
                | choiceReq
                | multiChoiceReq
                | dateReq
                | timeReq
                | decimalReq;



trueFalseReq: '[TrueOrFalse] ' '[value: 'value=INTEGER'] ' id=INTEGER 'RA: ' answer=BOOLEAN;
shortAReq: '[ShortAnswer] ' '[value: 'value=INTEGER'] ' id=INTEGER 'RA: ' answer=STRING;
intReq: '[Integer] ' '[value: 'value=INTEGER'] ' id=INTEGER 'RA: ' answer=INTEGER;
multiChoiceReq: '[MultiChoice] ' '[value: 'value=INTEGER'] ' id=INTEGER 'RA: ' (answer1 | answer2 | answer3| answer4);
choiceReq: '[Choice] ' '[value: 'value=INTEGER'] ' id=INTEGER 'RA: ' answer=STRING;
dateReq: '[Date] ' '[value: 'value=INTEGER'] ' id=INTEGER 'RA: ' answer=DATE_FORMAT;
timeReq: '[Time] ' '[value: 'value=INTEGER'] ' id=INTEGER 'RA: ' answer=TIME_FORMAT;
decimalReq: '[Decimal] ' '[value: 'value=INTEGER'] ' id=INTEGER 'RA: ' answer=DECIMAL_VALUE;

answer1: STRING STRING STRING STRING;
answer2: STRING STRING STRING;
answer3: STRING STRING;
answer4: STRING;


STRING: '"' (~["\\] | '\\' .)* '"';
BOOLEAN: 'true' | 'false';
INTEGER: ('0' | [1-9][0-9]*);

DATE_FORMAT: [0-9][0-9] '/' [0-9][0-9] '/' [0-9][0-9][0-9][0-9];
TIME_FORMAT: [0-9][0-9] ':' [0-9][0-9];
DECIMAL_VALUE: [0-9]+ ('.' [0-9]+)?;


WS: [ \t\r\n]+ -> skip;


