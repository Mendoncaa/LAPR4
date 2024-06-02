grammar InterviewQuestions;

interview: question+ END;

question
    : trueFalseQuestion
    | shortTextQuestion
    | singleChoiceQuestion
    | multipleChoiceQuestion
    | integerQuestion
    | decimalQuestion
    | dateQuestion
    | timeQuestion
    | numericScaleQuestion;

trueFalseQuestion
    : 'Q:' text 'T/F' 'W:' weight 'Choices:' 'True, False';

shortTextQuestion
    : 'Q:' text 'Short' 'W:' weight;

singleChoiceQuestion
    : 'Q:' text 'Single' 'W:' weight 'Choices:' choice (',' choice)*;

multipleChoiceQuestion
    : 'Q:' text 'Multiple' 'W:' weight 'Choices:' choice (',' choice)*;

integerQuestion
    : 'Q:' text 'Integer' 'W:' weight;

decimalQuestion
    : 'Q:' text 'Decimal' 'W:' weight;

dateQuestion
    : 'Q:' text 'Date' 'W:' weight;

timeQuestion
    : 'Q:' text 'Time' 'W:' weight;

numericScaleQuestion
    : 'Q:' text 'Scale' 'W:' weight 'Scale:' scale;

text: TEXT;
weight: NUMBER;
choice: TEXT;
scale: RANGE;

TEXT: ~[\r\n?]+;
NUMBER: [0-9]+;
RANGE: [0-9]+ '-' [0-9]+;
END: 'EndInterview';

WS: [ \t\r\n]+ -> skip;
