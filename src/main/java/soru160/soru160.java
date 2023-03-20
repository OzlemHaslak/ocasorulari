package soru160;

public class soru160 {
    public static void main(String[] args) {
        int x;
        /* insert code here */
        x = 3;
        do {
            System.out.print("*"); //****
            x--;
        } while (x >= 0);

        System.out.println();

        x = 0;
        do {
            System.out.print("*"); //*
            x++;
        } while (x >= 3);

        System.out.println();

        x = 0;
        do {
            System.out.print("*"); //*
            ++x;
        }while (x > 3);

        System.out.println();

        x = 3;
        do {
            System.out.print("*"); //**
            x--;
        }while (x != 1);

        System.out.println();

        x = 0;
        do {
            System.out.print("*"); //****
        }  while (x++ < 3);

    }
}
//Which two code fragments inserted at line 10 print ****? 4 tane yildiz
/* Cevap A ve E
x = 3;
do {
System.out.print("*");
x--;
} while (x >= 0);

x = 0; do {
System.out.print("*");
} while (x++ < 3);

 */

