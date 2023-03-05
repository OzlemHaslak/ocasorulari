package soru129;

public class soru129 {
    public static void main(String[] args) {
        try {
            int num = 10;

            int div = 0;
            int ans = num / div;
        } catch (ArithmeticException ae) {
            System.out.println( "exception"); //ans = 0; // line n1
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }
       System.out.println("Answer = " ); // line n2
}}
