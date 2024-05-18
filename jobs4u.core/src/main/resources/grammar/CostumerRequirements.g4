grammar CostumerRequirements;

requirements: requirement+ ;
requirement: 'R:' requirementName=String 'AS' requirementsType '\n' ;

requirementsType: 'text' (MAY_BE String)?
                | 'number' MAY_BE Decimal
                | 'multiple' 'into' '[' arr ']'
                | 'yes/no' MAY_BE ('yes'|'no') ;

arr: String (COMA_TOKEN String)* ;

String: '"' ~'"'+ '"' ;
Decimal: '0'|[1-9][0-9]* ;
COMA_TOKEN: ',' ;
MAY_BE: 'may be' ;
WS: [ \t\n\r]+ -> skip ;
