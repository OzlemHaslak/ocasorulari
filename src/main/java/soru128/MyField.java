package soru128;

public class MyField {
    int x;
    int y ;
    public void doStuff(int x, int y) {
        x = x;
        y = this.y;
    }
    public void display () {
        System.out.print(x + " " + y + " : ");
    }
        public static void main(String[] args) {
            MyField ml = new MyField();
            ml.x = 100;
            ml.y = 200;
            MyField m2 = new MyField();
            m2.doStuff(ml.x, ml.y);
            ml.display();
            m2 .display();
        }}
