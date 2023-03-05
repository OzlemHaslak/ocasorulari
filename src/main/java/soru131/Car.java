package soru131;

public class Car extends Vehicle{

    int y;
    Car() {
        super () ;
   //    this(20); // line n2
    }
    Car(int y) {
        this.y = y;
    }
    public String toString () {
        return super.x + ": " + this.y;

    }

    public static void main(String[] args) {


        Vehicle y = new Car();
        System.out.println(y);

}}
