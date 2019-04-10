//Unary operator test

    //Post increment
        int i1 = 1;
        long l2 = 2L;
        double d3 = (double)3;
        short s4 = (short)4;

        i1++;
        l2++;
        d3++;
        s4++;

        src.parsing.Class2 c95 = new src.parsing.Class2();

        java.lang.System.out.println(c95.i++);
        java.lang.System.out.println(c95.i);

        java.lang.System.out.println(c95.j++);
        java.lang.System.out.println(src.parsing.Class2.j);
    //Post increment

    //Post decrement
        i1--;
        l2--;
        d3--;
        s4--;

        java.lang.System.out.println(c95.i--);
        java.lang.System.out.println(c95.i);

        java.lang.System.out.println(c95.j--);
        java.lang.System.out.println(src.parsing.Class2.j);
    //Post increment

    //Pre increment

        ++i1;
        ++l2;
        ++d3;
        ++s4;

        java.lang.System.out.println(++c95.i);
        java.lang.System.out.println(c95.i);

        java.lang.System.out.println(++c95.j);
        java.lang.System.out.println(src.parsing.Class2.j);
    //Pre increment

    //Pre decrement

        --i1;
        --l2;
        --d3;
        --s4;

        java.lang.System.out.println(--c95.i);
        java.lang.System.out.println(c95.i);

        java.lang.System.out.println(--c95.j);
        java.lang.System.out.println(src.parsing.Class2.j);
    //Pre decrement

    //Boxed types test

        java.lang.Integer i152 = 1234;

        i152++;
        java.lang.System.out.println(i152++);
        java.lang.System.out.println(i152);

        --i152;
        java.lang.System.out.println(--i152);
        java.lang.System.out.println(i152);

        java.lang.Double d99 = (double)1234;

        d99--;
        java.lang.System.out.println(d99--);
        java.lang.System.out.println(d99);

        ++d99;
        java.lang.System.out.println(++d99);
        java.lang.System.out.println(d99);

    //Boxed types test
//Unary operator test