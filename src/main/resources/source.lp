//region Method invocation test
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

//region (un)boxing test
java.lang.Integer qwe = java.lang.Integer.valueOf(2)
java.lang.Byte ewq = java.lang.Byte.valueOf("0")

char c = 1; //Assignment unboxing tests
int i = c;
java.lang.Byte b = i;
short s = b;
s = matrix[0][2]

matrix[0][2] = c; //Array assignment unboxing tests
matrix[0][c] = b;

java.lang.Short d = 2
java.lang.Byte[] bytes = new java.lang.Byte[d] //Array index unboxing tests
bytes[0] = c
bytes[c] = s

java.lang.System.out.println(bytes[0]) //Static method unboxing tests
java.lang.System.out.println(bytes[c])

src.parsing.Class2 cls2 = new src.parsing.Class2(d) //Constructor unboxing test
cls2.printString(b) //Object method unboxing tests
cls2.printString(s)
//endregion

src.parsing.Class2.sf = cls2
cls2.field = cls2