package oca.soru20;

public class Test {
    int al;
    public static void doProduct(int a) {
        a = a * a ;
    }
    public static void doString(String s) {
        s.concat(" " + s);}

    public static void main(String[] args) {


            Test item = new Test();
            item.al = 11;
            String sb = "Hello";
            Integer i = 10;
            doProduct(i);
            doString(sb);
            doProduct(item.al);
            System.out.println(i + " " + sb + " " + item.al);
        }
    }