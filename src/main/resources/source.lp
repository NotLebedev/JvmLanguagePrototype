//region Method invocation test
((java.lang.System).out).println(java.lang.Math.abs(-1));
src.parsing.Class2.test().printString();
//endregion

//region variable tests
java.lang.String str1 = "Hello ";
java.lang.String str2 = "world!";

java.lang.String tmp;
tmp = str1;
str1 = str2;
str2 = tmp;

java.lang.System.out.println(str1);
java.lang.System.out.println(str2);


java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("123");
         sb.append(4);
        sb.append(5);
        (sb).append(6);
java.lang.System.out.println(sb.toString());
//endregion

//region array test
java.lang.String[] strs1 = new java.lang.String[3];

strs1[0] = "www";
strs1[1] = "replaced";
strs1[2] = "qwe";

java.lang.System.out.print(strs1[0]);
java.lang.System.out.print(strs1[1]);
java.lang.System.out.println(strs1[2]);

int[][] matrix = new int[3][3];

matrix[0][0] = 1;
matrix[0][1] = 2;
matrix[0][2] = 3;

matrix[1][0] = 2;
matrix[1][1] = 4;
matrix[1][2] = 6;

matrix[2][0] = 3;
matrix[2][1] = 6;
matrix[2][2] = 9;

java.lang.System.out.print(matrix[0][0]);
java.lang.System.out.print(matrix[0][1]);
java.lang.System.out.println(matrix[0][2]);

java.lang.System.out.print(matrix[1][0]);
java.lang.System.out.print(matrix[1][1]);
java.lang.System.out.println(matrix[1][2]);

java.lang.System.out.print(matrix[2][0]);
java.lang.System.out.print(matrix[2][1]);
java.lang.System.out.println(matrix[2][2]);
//endregion

//region type matching test

java.lang.Integer qwe = 1234; //Superclass matching
java.lang.Object obj = qwe;
java.lang.System.out.println(obj);

java.lang.CharSequence seq = "Interface matching";
java.lang.System.out.println(seq);
src.parsing.Class2.print("And once again");

int i = qwe; //Kind of (un)boxing test
qwe = i; //TODO : implement for rest of types

//endregion

//region cast test
java.lang.Integer castTest = (java.lang.Integer)obj;
int i83 = 83;
double d84 = (double) i83;
long l85 = (long) d84;
short s86 = (short) l85;
//endregion

float f = 123.123;
f = 2019F;
long lng = 2019L;
f ++;

//Test for multiplicative operators * / %

    //basic types

        int i0 = 123; int i1 = 34; int i2 = 12;
        java.lang.Byte b0 = -(byte)123; java.lang.Byte b1 = -(byte)34; java.lang.Byte b2 = -(byte)12;
        short s0 = -(short)123; short s1 = -(short)34; short s2 = -(short)12;
        char c0 = (char)123; char c1 = (char)34; char c2 = (char)12;
        long l0 = 123l; long l1 = 34l; long l2 = 12l;
        float f0 = 123.0; float f1 = 34.0; float f2 = 12.0;
        double d0 = (double)123.0; double d1 = (double)34.0; double d2 = (double)12.0;

        java.lang.System.out.println(i0 * (i1 / i2) % i1);
        java.lang.System.out.println((int)(b0 * (b1 / b2) % b1));
        java.lang.System.out.println((int)(s0 * (s1 / s2) % s1));
        java.lang.System.out.println((int)(c0 * (c1 / c2) % c1));
        java.lang.System.out.println(l0 * (l1 / l2) % l1);
        java.lang.System.out.println(f0 * (f1 / f2) % f1);
        java.lang.System.out.println(d0 * (d1 / d2) % d1);

    //

    //boxed types

        java.lang.Integer ic0 = 123; java.lang.Integer ic1 = 34; java.lang.Integer ic2 = 12;
        java.lang.Byte bc0 = -(byte)123; java.lang.Byte bc1 = -(byte)34; java.lang.Byte bc2 = -(byte)12;
        java.lang.Short sc0 = -(short)123; java.lang.Short sc1 = -(short)34; java.lang.Short sc2 = -(short)12;
        java.lang.Character cc0 = (char)123; java.lang.Character cc1 = (char)34; java.lang.Character cc2 = (char)12;
        java.lang.Long lc0 = 123l; java.lang.Long lc1 = 34l; java.lang.Long lc2 = 12l;
        java.lang.Float fc0 = 123.0; java.lang.Float fc1 = 34.0; java.lang.Float fc2 = 12.0;
        java.lang.Double dc0 = (double)123.0; java.lang.Double dc1 = (double)34.0; java.lang.Double dc2 = (double)12.0;

        java.lang.System.out.println(ic0 * (ic1 / ic2) % ic1);
        java.lang.System.out.println((int)(bc0 * (bc1 / bc2) % bc1));
        java.lang.System.out.println((int)(sc0 * (sc1 / sc2) % sc1));
        java.lang.System.out.println((int)(cc0 * (cc1 / cc2) % cc1));
        java.lang.System.out.println(lc0 * (lc1 / lc2) % lc1);
        java.lang.System.out.println(fc0 * (fc1 / fc2) % fc1);
        java.lang.System.out.println(dc0 * (dc1 / dc2) % dc1);

    //

//