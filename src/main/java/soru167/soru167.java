package soru167;

public class soru167 {
    public static void main(String[] args) {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a < b) ? (a < c) ? a: (b <c )? b: c : x;

                System.out.println(d);

    }
}
