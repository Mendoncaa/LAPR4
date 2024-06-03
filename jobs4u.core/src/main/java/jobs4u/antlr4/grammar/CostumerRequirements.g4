grammar CostumerRequirements;


start: header requirement+ EOF;


header:  text=STRING;


requirement: id=INTEGER 'RQ: ' requirementContent=STRING reqType;


reqType: trueFalseReq
                | shortAReq
                | intReq
                | choiceReq;


trueFalseReq: '[TrueOrFalse] ' id=INTEGER 'RA: ' answer=BOOLEAN;
shortAReq: '[ShortAnswer] ' id=INTEGER 'RA: ' answer=STRING;
intReq: '[Integer] ' id=INTEGER 'RA: ' answer=INTEGER;
choiceReq: '[Choice] ' id=INTEGER 'RA: ' answer=STRING;


STRING: '"' (~["\\] | '\\' .)* '"';
BOOLEAN: 'true' | 'false';
INTEGER: ('0' | [1-9][0-9]*);
REAL: [0-9]+ '.' [0-9]+;


WS: [ \t\r\n]+ -> skip;
