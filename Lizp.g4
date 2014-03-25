grammar Lizp;

WS: [ \t] -> skip;
NEWLINE : [\r\n] -> skip;

ID: [_a-zA-Z][_0-9a-zA-Z]*;
NUMBER: [+-]?[0-9]+('.'[0-9]+)?;

//Initiated Program as the first non-terminal procedure
program: sExp EOF;
sExp : atom | arithExpr | relExpr | boolExpr | conExpr | printExpr | bindExpr;
atom : ID | NUMBER;
arithExpr : unaryExpr | binaryExpr | naryExpr;
unaryExpr : '(' unaryOp sExp ')';
unaryOp : '-' | 'abs' | 'ceil' | 'floor' | 'round';
binaryExpr : '(' binaryOp sExp sExp ')';
binaryOp : '/';
naryExpr : '(' naryOp sExp sExp+ ')';
naryOp : '+'| '*'| 'max'| 'min'; 
relOp : '=' | '/=' | '<' | '>' | '<=' | '>=';
relExpr : '(' relOp sExp sExp ')';
        
boolExpr : notExpr | andExpr | orExpr;
notExpr : '(' 'not' sExp ')';
andExpr : '(' 'and' sExp+ ')';
orExpr : '(' 'or' sExp+ ')';
conExpr : ifExpr | condExpr;
ifExpr : '(' 'if' sExp sExp sExp? ')';
condExpr : '(' 'cond' sExp+ ')';

printExpr : '(' 'print' sExp+ ')';
bindExpr : '(' 'set' ID sExp ')';