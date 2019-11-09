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

value   : literalCG #LITERAL
        | methodInv #METHOD_INV
        | id #ID_LABEL
        | objectInstantiation #OBJECT_INSTANTIATION
        | cast #CAST_LABEL
        | bracketOpenS value bracketCloseS #PARENTHESIS
        | value dotS value #ACCESS
        | value arrayIndex #ARRAY_ACCESS
        | value incrementS #POST_INCREMENT
        | value decrementS #POST_DECREMENT
        | preIncrement #PRE_INCREMENT
        | preDecrement #PRE_DECREMENT
        | unaryPlus #UNARY_PLUS
        | unaryMinus #UNARY_MINUS
        | invertS value #INVERT
        | value (asteriskS | slashS | percentS) value #MULTIPLICATIVE_OP
        | value (plusS | minusS) value #ADDITIVE_OP
        | value (rightShiftArithmetic | rightShiftLogical | leftShift) value #SHIFT_OP
        | value (less | lessEqual | more | moreEqual) value #RELATIONAL_OP
        | value (equal | notEqual) value #EQUALITY_OP
        | value bitAnd value #BITWISE_AND
        | value bitXor value #BITWISE_XOR
        | value bitOr value #BITWISE_OR;

preIncrement : incrementS value;
preDecrement : decrementS value;

unaryPlus : plusS value ;
unaryMinus : minusS value ;

cast : bracketOpenS declarationType bracketCloseS value;

objectInstantiation : newKW arrayType (arrayIndex+ arrayModifier* | bracketOpenS (value commaS)* value? bracketCloseS) ;

literalCG :    stringCG |
                integerCG |
                longCG |
                floatCG |
                characterCG ;

className : path ;

classAccess :  (path |  methodInv)/* (dotS classAccess)? */;
methodInv : id bracketOpenS (value commaS)* value? bracketCloseS ;

eol : semicolonS;

WS : [ \n\t\r] -> skip ;
