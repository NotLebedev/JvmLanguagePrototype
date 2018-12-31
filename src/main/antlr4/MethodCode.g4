//Define a grammar called MethodCode
//Created by Tema on 26.07.2018

grammar MethodCode ;

import TokenRules, Tokens ;

methodCode : (expression eol) * ;

expression : variableDeclaration | variableAssignment | value ;

variableDeclaration : declarationType id assignment? ;

arrayType : booleanT |
       byteT |
       charT |
       longT |
       shortT |
       intT |
       floatT |
       doubleT |
       className ;

declarationType : arrayType arrayModifier* ;

arrayModifier : squareBracketOpen squareBracketClose ;
arrayIndex : squareBracketOpen value squareBracketClose ;

variableAssignment : value assignment ;

assignment : equalsS value ;

value   : literalCG
        | methodInv
        | id
        | objectInstantiation
        | cast
        | bracketOpenS value bracketCloseS
        | value dotS value
        | value arrayIndex ;

cast : bracketOpenS declarationType bracketCloseS value;

objectInstantiation : newKW arrayType (arrayIndex+ arrayModifier* | bracketOpenS (value commaS)* value? bracketCloseS) ;

literalCG :    stringCG |
                integerCG |
                floatCG |
                characterCG ;

className : path ;

classAccess :  (path |  methodInv)/* (dotS classAccess)? */;
methodInv : id bracketOpenS (value commaS)* value? bracketCloseS ;

eol : semicolonS | ;

WS : [ \n\t\r] -> skip ;
