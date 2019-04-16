/*//region Method invocation test
((java.lang.System).out).println(java.lang.Math.abs(-1));
src.parsing.Class2.test().printString()
//endregion

//region variable tests
java.lang.String str1 = "Hello "
java.lang.String str2 = "world!";

java.lang.String tmp
tmp = str1;
str1 = str2
str2 = tmp;

java.lang.System.out.println(str1)
java.lang.System.out.println(str2)


java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("123");
         sb.append(4);
        sb.append(5);
        (sb).append(6);
java.lang.System.out.println(sb.toString());
//endregion

//region array test
java.lang.String[] strs1 = new java.lang.String[3]

strs1[0] = "www"
strs1[1] = "replaced"
strs1[2] = "qwe"

java.lang.System.out.print(strs1[0])
java.lang.System.out.print(strs1[1])
java.lang.System.out.println(strs1[2])

int[][] matrix = new int[3][3]

matrix[0][0] = 1
matrix[0][1] = 2
matrix[0][2] = 3

matrix[1][0] = 2
matrix[1][1] = 4
matrix[1][2] = 6

matrix[2][0] = 3
matrix[2][1] = 6
matrix[2][2] = 9

java.lang.System.out.print(matrix[0][0])
java.lang.System.out.print(matrix[0][1])
java.lang.System.out.println(matrix[0][2])

java.lang.System.out.print(matrix[1][0])
java.lang.System.out.print(matrix[1][1])
java.lang.System.out.println(matrix[1][2])

java.lang.System.out.print(matrix[2][0])
java.lang.System.out.print(matrix[2][1])
java.lang.System.out.println(matrix[2][2])
//endregion

//region type matching test

java.lang.Integer qwe = 1234 //Superclass matching
java.lang.Object obj = qwe
java.lang.System.out.println(obj)

java.lang.CharSequence seq = "Interface matching"
java.lang.System.out.println(seq)
src.parsing.Class2.print("And once again")

int i = qwe //Kind of (un)boxing test
qwe = i //TODO : implement for rest of types

//endregion

java.lang.Integer castTest = (java.lang.Integer)obj
java.lang.System.out.println(castTest)

int i83 = 83
double d84 = (double) i83
long l85 = (long) d84
short s86 = (short) l85
*/

int i = 123;
    byte b = -(byte)123;
    short s = -(short)123;
    char c = (char)123;
    long l = 123l;
    float f = 123.0;
    double d = (double)123.0;

java.lang.System.out.println(-i);
java.lang.System.out.println((int)b);
java.lang.System.out.println((int)s);
java.lang.System.out.println(-c);
java.lang.System.out.println(-l);
java.lang.System.out.println(-f);
java.lang.System.out.println(-d);