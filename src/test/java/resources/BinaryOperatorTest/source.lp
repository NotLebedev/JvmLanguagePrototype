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