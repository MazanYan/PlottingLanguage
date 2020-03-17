grammar MyLanguage;

start : (fun NL+)* statement end;

fun : DEF ID OP_BR_ORD args_decl CL_BR_ORD OP_BR_FIG
        NL?
        (statement NL)*
        RETURN expression
        NL?
     CL_BR_FIG;

fun_call : (ID | STANDARD_FUNC) '(' args_call ')';
args_decl : (ID COMMA)* ID;
args_call : ((ID | number) COMMA)* (ID | number);

statement : ID (EQU | EQU_OP) expression;
number : INT | DOUBLE;
expression : OP_BR_ORD expression CL_BR_ORD         #Brackets
           | '|' expression '|'                     #Abs
           | expression '!'                         #Factorial
           | expression op=('*' | '/') expression   #MulDiv
           | expression op=('+' | '-') expression   #AddSub
           | ID                                     #Id
           | fun_call                               #FunCall
           | number                                 #Num;
end : NL* EOF;

STANDARD_FUNC : 'abs'
              | 'factorial'
              | 'sin'
              | 'cos'
              | 'tan'
              | 'cot'
              | 'arcsin'
              | 'arccos'
              | 'arctan'
              | 'arccot';

DEF : 'def';
RETURN : 'return';
OP_BR_ORD : '(';
CL_BR_ORD : ')';
OP_BR_ARR : '[';
CL_BR_ARR : ']';
OP_BR_FIG : '{';
CL_BR_FIG : '}';
COMMA     : ',';
MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
EQU : '=';
EQU_OP : '+='
       | '-='
       | '*='
       | '/=';

WS : [ \t] -> skip;
NL : '\r'? '\n';

ID : [_a-zA-Z] [_a-zA-Z0-9]*;
INT : [+-]? [0-9]+;
DOUBLE : [+-]? [0-9]+ ('.'[0-9]+);

