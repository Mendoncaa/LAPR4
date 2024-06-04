grammar InterviewAnswers;

intervdiew: questionAnswer+ END;

questionAnswer
    : trueFalseAnswer
    | shortTextAnswer
    | singleChoiceAnswer
    | multipleChoiceAnswer
    | integerAnswer
    | decimalAnswer
    | dateAnswer
    | timeAnswer
    | numericScaleAnswer;

trueFalseAnswer
    : 'Q:' text 'T/F' 'W:' weight 'Choices:' 'True, False' 'A:' answerTrueFalse;

shortTextAnswer
    : 'Q:' text 'Short' 'W:' weight 'A:' answerShort;

singleChoiceAnswer
    : 'Q:' text 'Single' 'W:' weight 'Choices:' choice (',' choice)* 'A:' answerSingle;

multipleChoiceAnswer
    : 'Q:' text 'Multiple' 'W:' weight 'Choices:' choice (',' choice)* 'A:' answerMultiple;

integerAnswer
    : 'Q:' text 'Integer' 'W:' weight 'A:' answerInteger;

decimalAnswer
    : 'Q:' text 'Decimal' 'W:' weight 'A:' answerDecimal;

dateAnswer
    : 'Q:' text 'Date' 'W:' weight 'A:' answerDate;

timeAnswer
    : 'Q:' text 'Time' 'W:' weight 'A:' answerTime;

numericScaleAnswer
    : 'Q:' text 'Scale' 'W:' weight 'Scale:' scale 'A:' answerScale;

text: TEXT;
weight: NUMBER;
choice: TEXT;
scale: RANGE;

answerTrueFalse: 'True' | 'False';
answerShort: TEXT;
answerSingle: TEXT;
answerMultiple: TEXT (',' TEXT)*;
answerInteger: NUMBER;
answerDecimal: NUMBER;
answerDate: DATE;
answerTime: TIME;
answerScale: NUMBER;

TEXT: ~[\r\n?]+;
NUMBER: [0-9]+('.'[0-9]+)?;
RANGE: [0-9]+ '-' [0-9]+;
DATE: [0-9]+ '-' [0-9]+ '-' [0-9]+;
TIME: [0-9]+ ':' [0-9]+;

END: 'EndInterview';

WS: [ \t\r\n]+ -> skip;
