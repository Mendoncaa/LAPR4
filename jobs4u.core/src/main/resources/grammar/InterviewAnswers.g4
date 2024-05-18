grammar InterviewAnswers;

answers: answer+ ;
answer: true_false | short | single_choice | multiple_choice | int_q | real_q | date_q | time_q | scale_q ;

true_false: 'A:' questionId=String ':' tfAnswer=( 'TRUE' | 'FALSE' ) '\n' ;
short: 'A:' questionId=String ':' shortAnswer=String '\n' ;
single_choice: 'A:' questionId=String ':' singleChoiceAnswer=String '\n' ;
multiple_choice: 'A:' questionId=String ':' multipleChoiceAnswers=String (COMA_TOKEN multipleChoiceAnswers=String)* '\n' ;
int_q: 'A:' questionId=String ':' intAnswer=Decimal '\n' ;
real_q: 'A:' questionId=String ':' realAnswer=Real '\n' ;
date_q: 'A:' questionId=String ':' dateAnswer=String '\n' ;
time_q: 'A:' questionId=String ':' timeAnswer=String '\n' ;
scale_q: 'A:' questionId=String ':' scaleAnswer=Decimal '\n' ;

String: '"' ~'"'+ '"' ;
Decimal: '0'|[1-9][0-9]* ;
Real: Decimal ('.'|',') ('0' | [0-9]*[1-9]) ;
COMA_TOKEN: ',' ;
WS: [ \t\n\r]+ -> skip ;
