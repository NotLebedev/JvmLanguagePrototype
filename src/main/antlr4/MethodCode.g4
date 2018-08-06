//Define a grammar called MethodCode
//Created by Tema on 26.07.2018

grammar MethodCode ;

import TokenRules, Tokens ;

methodCode : (expression eol) * ;

expression : variableDeclaration | variableAssignment | classAccess ;

variableDeclaration : type id assignment? ;

type : ( booleanT |
       byteT |
       charT |
       longT |
       shortT |
       intT |
       floatT |
       doubleT |
       className ) arrayModifier* ;

arrayModifier : squareBracketOpen squareBracketClose  ;

variableAssignment : id assignment ;

assignment : equalsS value ;

value : literalCG | id | classAccess ;

literalCG :    stringCG |
                integerCG |
                floatCG |
                characterCG ;

className : path id ;//TODO : currently all classNames are with absolute path, add imports
                     //TODO : change path grammar to allow whitespaces

/*methodInvocation : path? chainedMethodInvocation ;

chainedMethodInvocation : id bracketOpenS (value commaS)* value? bracketCloseS ( dotS chainedMethodInvocation )? ;*/

classAccess :  (path | pathNoEndDot |  methodInv) /*methodInv?*/ (dotS classAccess)? ;
methodInv : id bracketOpenS (value commaS)* value? bracketCloseS ;

pathNoEndDot : path? id;


eol : (semicolonS | '\n')+ ;

WS : [ \n\t\r] -> skip ;
