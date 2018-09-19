//Define a grammar called Root
//Created by Tema on 27.07.2018

grammar Root;

import MethodCode ;

code : methodCode ;

COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;
