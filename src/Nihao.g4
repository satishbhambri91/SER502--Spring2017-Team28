grammar Nihao;

r : start;
start:statement+;

statement : print_statement|datatype_assignment|ifelse_statement|while_statement;
print_statement : Print LPAREN expression+ RPAREN;
datatype_assignment : (datatype)? variable '=' expression;
datatype: 'int' | 'bool';
ifelse_statement : if_statement (else_statement)? ;
if_statement: If LPAREN expression_if RPAREN Start start End;
else_statement: Else Start start End;
while_statement : While LPAREN expression_while RPAREN Do start Od;
expression_if: expression;
expression_while: expression;
expression : integer | operation |  bool;
operation :  exp(('>'|'>='|'<'|'<='|'==')exp)*;
exp: term('+'term|'-'term)*;
term: factor('*'factor|'/'factor|'%'factor)*;
factor: NUMBER | VARIABLE|LPAREN operation RPAREN;

variable : VARIABLE;
If: 'if';
Print: 'print';
While:'while';
Start:'start';
Else:'else';
End:'end';
Do:'do';
Od:'od';
LPAREN:'(';
RPAREN:')';
VARIABLE: [A-Za-z_][A-Za-z0-9_]*;
NUMBER : ('0'..'9')+;
integer: (NUMBER)+;
bool: 'True' | 'False';
WS : [ \t\r\n]+ -> skip ;