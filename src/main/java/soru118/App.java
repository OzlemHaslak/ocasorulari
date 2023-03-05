package soru118;

public class App {
    public static void main (String[] args) {
        String strl = "Java";
        String str2 = new String("java");
        if (str2.equals(strl.toLowerCase())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }}