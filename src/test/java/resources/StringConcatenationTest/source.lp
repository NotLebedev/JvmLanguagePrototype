//String literal optimization test

    java.lang.System.out.println(("abc" + "def") + ("ghi" + "jkl"));
    java.lang.System.out.println("abc" + ("def" + ("ghi" + "jkl")));
    java.lang.System.out.println(((("a" + "b") + ("c" + "d")) + ("e" + "f")) + ("g" + "h") + (("i" + "j") + ("k" + "l")));

//

//Concatenation test

    java.lang.String str1 = "abc";
    java.lang.String str2 = "def";
    int i = 123;

    java.lang.System.out.println(str1 + i + str2 + "_STRRTRR_" + str1 + 13232);

//