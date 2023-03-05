package soru116;

public class C extends A{
    public void test () {
        System.out.println ("C");
    }
    public static void main (String [] args) {
        A bl = new A ();
        A b2 = new C ();
        bl = (A) b2; //line nl
        A b3 = (B) b2; //line n2
        bl.test ();
        b3.test ();
}}
// b3 objectsi olusturmadi  C EXTENDS B DEYIL
