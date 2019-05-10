
java.lang.String str1 = "abc";
java.lang.String str2 = "def";
//These values are used to ensure proper work with primitives
int i = 123;
float f = 123.0;
//This seemingly strange value is used to ensure proper work with objects
java.io.PrintStream o = java.lang.System.out;

//Checking usual concatenation
java.lang.System.out.println(str1 + i + str2 + o + f);
//Checking "stringification" (note that while work of asm is proper next two concats share
//the same bootstrap method)
java.lang.System.out.println("" + i);
java.lang.System.out.println("" + o);
//Checking work in combination with literal optimization and unusual bracket orders
java.lang.System.out.println("qwe" + "qew" + o + "qwe" + ("qwe" + i + ("qw" + "e")));