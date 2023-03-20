package oca.soru22;

public class soru22 {
    public static void main(String[] args) {
        int  ans=1;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae) {
            ans =0; // line nl
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }
       // int ans = 10;
       System.out.println("Answer = " + ans); // line n2
}}
