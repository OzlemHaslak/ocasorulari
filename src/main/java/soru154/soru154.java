package soru154;

import java.util.ArrayList;

public class soru154 {
    public static void main (String[] args) {
        ArrayList myList = new ArrayList ();
        String [] myArray;
        try {
            while (true) {
                myList.add("My String");
            }           }
catch (RuntimeException re){
        System.out.println("Caught a RuntimeException");
    }
catch (Exception e) {
    System.out.println("caught an Exception");
}
        System.out.println("Ready to use");
}}
// while sonsuz dongu ye geciyor