package src.parsing;

public class Class2 {

    public Class2 field;
    public static Class2 sf;

    public Class2(char c) {

    }

    public static void print(String[] str) {

        for (String s : str) {
            System.out.println(s);
        }

    }

    public static void print(String str) {

        System.out.println(str);

    }

    public static int[][][] getArr() {

        return new int[3][4][];

    }

    public static Class2 test() {

        return new Class2('c');

    }

    public void printString() {

        System.out.println("YES!!!!");

    }

    public void printString(short s) {

        System.out.println("short");

    }

    public static class InnerClass {

        public static void qwe() {
        }

    }

}
