grammar CandidateRequirements;

responses: response+ ;
response: 'R:' requirementName=String ':' answer=String '\n' ;

String: '"' ~'"'+ '"' ;
Decimal: '0'|[1-9][0-9]* ;
COMA_TOKEN: ',' ;
WS: [ \t\n\r]+ -> skip ;
