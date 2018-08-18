//Define a grammar called MethodCode
//Created by Tema on 26.07.2018

grammar MethodCode ;

import TokenRules, Tokens ;

methodCode : (expression eol) * ;

expression : variableDeclaration | variableAssignment | value ;

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

value   : literalCG
        | id
        | methodInv
        | objectInstantiation
        | value dotS value ;

objectInstantiation : 'new' type bracketOpenS (value commaS)* value? bracketCloseS ;

literalCG :    stringCG |
                integerCG |
                floatCG |
                characterCG ;

className : path ;//TODO : currently all classNames are with absolute path, add imports

classAccess :  (path |  methodInv)/* (dotS classAccess)? */;
methodInv : id bracketOpenS (value commaS)* value? bracketCloseS ;

eol : semicolonS | ;

WS : [ \n\t\r] -> skip ;
