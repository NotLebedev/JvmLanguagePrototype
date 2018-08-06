//Define a grammar called Tokens
//Created by Tema on 26.07.2018

lexer grammar Tokens;

//Tokens

//Access modifiers
PUBLIC : 'public' ;
PRIVATE : 'private' ;
PROTECTED : 'protected' ;

STATIC : 'static' ;

ABSTRACT : 'abstract' ;

SYNCHRONIZED : 'synchronized' ;

TRANSIENT : 'transient' ;

VOLATILE : 'volatile' ;

FINAL : 'final' ;

NATIVE : 'native' ;

STRICTFP : 'strictfp' ;
//End access modifiers

//Types

BOOLEAN : 'boolean' ;

BYTE : 'byte' ;
CHAR : 'char' ;
LONG : 'long' ;
SHORT : 'short' ;
INT : 'int' ;
FLOAT : 'float' ;
DOUBLE : 'double' ;

//End types

//Namings
fragment LOWCHAR :   'a'..'z';

fragment HIGHCHAR :   'A'..'Z';

fragment DIGIT : '0'..'9';

ID : (LOWCHAR|HIGHCHAR) (LOWCHAR|HIGHCHAR|DIGIT)* ;
//PATH : (WHITESPACE* ID WHITESPACE* DOT)+ ;
//End namings

//Types capture groups
STRINGCG : '"'.*?'"' ;
INTEGERCG : MINUS? [0-9]+ ;
FLOATCG : MINUS? [0-9]+ DOT? [0-9]* ;
CHARACTERCG : '\''.'\'' ;
//End types capture groups

//End tokens

//Symbols
DOT : '.' ;
SEMICOLON : ';' ;
EQUALS : '=' ;
COMMA : ',' ;
INEQUALITYOPEN : '<' ;
INEQUALITYCLOSE : '>' ;
BRACEOPEN : '{' ;
BRACECLOSE : '}' ;
BRACKETOPEN : '(' ;
BRACKETCLOSE : ')' ;
MINUS : '-' ;
SQUAREBRACKETOPEN : '\u005B' ;
SQUAREBRACKETCLOSE : '\u005D' ;
//End symbols