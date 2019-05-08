//String literal optimization test

    java.lang.System.out.println(("abc" + "def") + ("ghi" + "jkl"));
    java.lang.System.out.println("abc" + ("def" + ("ghi" + "jkl")));
    java.lang.System.out.println(((("a" + "b") + ("c" + "d")) + ("e" + "f")) + ("g" + "h") + (("i" + "j") + ("k" + "l")));

//