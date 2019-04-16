//Test for operators unary plus and unary minus

    //Unary plus
    //This operator automatically converts any type possible to int

    int i0 = 123;
    byte b0 = (byte)123;
    short s0 = (short)123;
    char c0 = (char)123;
    long l0 = 123l;
    float f0 = 123.0;
    double d0 = (double)123.0;

    int convertHere = +i0;
    convertHere = +b0;
    convertHere = +s0;
    convertHere = +c0;
    convertHere = +l0;
    convertHere = +f0;
    convertHere = +d0;
    //

    //Unary minus
    //Negation

    int i = 123;
    byte b = -(byte)123;
    short s = -(short)123;
    char c = (char)123;
    long l = 123l;
    float f = 123.0;
    double d = (double)123.0;

    java.lang.Integer ic= i;
    java.lang.Byte bc= b;
    java.lang.Short sc = s;
    java.lang.Character cc = c;
    java.lang.Long lc = l;
    java.lang.Float fc = f;
    java.lang.Double dc = d;

    java.lang.System.out.println(-i);
    java.lang.System.out.println((int)b);
    java.lang.System.out.println((int)s);
    java.lang.System.out.println(-c);
    java.lang.System.out.println(-l);
    java.lang.System.out.println(-f);
    java.lang.System.out.println(-d);

    java.lang.System.out.println(-ic);
    java.lang.System.out.println((int)-bc);
    java.lang.System.out.println((int)-sc);
    java.lang.System.out.println(-cc);
    java.lang.System.out.println(-lc);
    java.lang.System.out.println(-fc);
    java.lang.System.out.println(-dc);

    //

//