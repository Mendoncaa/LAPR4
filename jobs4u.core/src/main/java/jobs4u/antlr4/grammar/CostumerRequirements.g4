grammar CostumerRequirements;

requirements: requirement+ EOF;

requirement: 'R:' text NUMBER;

text: TEXT;
NUMBER: [0-9]+('.'[0-9]+)?;

TEXT: ~[\r\n?]+;

WS: [ \t\r\n]+ -> skip;
