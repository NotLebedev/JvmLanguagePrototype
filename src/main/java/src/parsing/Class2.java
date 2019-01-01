package src.parsing;

public class Class2 {

    public Class2 field;
    public static Class2 sf;
    public int i = 0;

    public Class2(char c) {
        int i = 1;

        int b = (i + 2) * (i++);
        this.i ++;

    }

    public static void print(String[] str) {

        for (String s : str) {
            System.out.println(s);
        }

    }

    public static void print(CharSequence str) {

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
