//Define a grammar called TokenRules
//Created by Tema on 26.07.2018

grammar TokenRules;

import Tokens ;

//Tokens

//Access modifiers
publicAM : PUBLIC ;
privateAM : PRIVATE ;
protectedAM : PROTECTED ;

staticAM : STATIC ;

abstractAM : ABSTRACT ;

synchronizedAM : SYNCHRONIZED ;

transientAM : TRANSIENT ;

volatileAM : VOLATILE ;

finalAM : FINAL ;

nativeAM : NATIVE ;

strrictfpAM : STRICTFP ;
//End access modifiers

//Types

booleanT : BOOLEAN ;
byteT : BYTE ;
charT : CHAR ;
longT : LONG ;
shortT : SHORT ;
intT : INT ;
floatT : FLOAT ;
doubleT : DOUBLE ;

//End types

//Namings
id : ID ;
path : PATH;
//End namings

//Types capture groups
stringCG : STRINGCG ;
integerCG : INTEGERCG ;
floatCG : FLOATCG ;
characterCG : CHARACTERCG ;
//End types capture groups

//End tokens

//Symbols
dotS : DOT ;
semicolonS : SEMICOLON ;
equalsS : EQUALS ;
commaS : COMMA ;
inequalityOpenS : INEQUALITYOPEN ;
inequalityCloseS : INEQUALITYCLOSE ;
braceopenS : BRACEOPEN ;
brcecloseS : BRACECLOSE ;
bracketOpenS : BRACKETOPEN ;
bracketCloseS : BRACKETCLOSE ;
//End symbols

//End tokens