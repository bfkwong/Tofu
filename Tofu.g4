grammar Tofu;

program: (funDecls | classDecls | stmt)*;

classDecls:
	'blueprint' 'for' IDENTIFIER '{' (funDecls | stmt)* '}';

funDecls:
	IDENTIFIER '(' parameterList ')' '=' '{' stmt* '}'
	| IDENTIFIER '(' parameterList ')' '=' expStmt;

parameterList: (IDENTIFIER (',' IDENTIFIER)*)?;

stmt:
	iterationStmt
	| blockStmt
	| expStmt
	| ifStmt
	| printStmt
	| retStmt;

retStmt: 'return' (expression)?;

expStmt: expression ';';

blockStmt: '{' stmt* '}';

ifStmt:
	'if' '(' expression ')' 'is' 'true' 'then' blockStmt (
		'or' 'else' blockStmt
	)?;

printStmt: 'print' '(' expression ')' ';';

iterationStmt: 'while' '(' expression ')' 'is' 'true' blockStmt;

expression: logORExpression ('=' expression)?;

logORExpression: logANDExpression ('or' logANDExpression)?;

logANDExpression: eqExpression ('and' eqExpression)?;

eqExpression: relExpression (eqOp relExpression)?;

relExpression: addExpression (relOp addExpression)?;

addExpression: multExpression (addOp multExpression)?;

multExpression: unaryExpression (multOp unaryExpression)?;

unaryExpression: unaryOp? callMemExpression;

callMemExpression:
	primaryExpression (arguments | '\'s ' IDENTIFIER)*;

arguments: '(' argumentList ')';

argumentList: (expression (',' expression)*)?;

primaryExpression:
	'(' expression ')'
	| NUMBER
	| BOOLEAN
	| STRING
	| UNDEFINED
	| IDENTIFIER;

eqOp: '==' | '!=';

relOp: '>' | '>=' | '<' | '<=';

addOp: '+' | '-';

multOp: '*' | '/';

unaryOp: '!' | '-';

BOOLEAN: 'true' | 'false';

UNDEFINED: 'undefined';

STRING:
	'"' (ESC | SAFECODEPOINT)* '"'
	| '\'' (ESC | SAFECODEPOINT)* '\'';

IDENTIFIER: [a-zA-Z] [0-9a-zA-Z]*;

fragment SAFECODEPOINT: ~ ["\\\u0000-\u001F];

fragment ESC: '\\' (["\\/bfnrt] | UNICODE);

fragment UNICODE: 'u' HEX HEX HEX HEX;

fragment HEX: [0-9a-fA-F];

NUMBER: INT ('.' [0-9]+)? EXP?;

fragment INT: '0' | [1-9] [0-9]*;

fragment EXP: [Ee] [+\-]? INT;

Whitespace: [ \t]+ -> skip;

Newline: ('\r' '\n'? | '\n') -> skip;