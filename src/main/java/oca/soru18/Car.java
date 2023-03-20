package oca.soru18;

public class Car extends Vehicle {

    String trans;

    Car(String trans) { //line nl
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed); // line n2
        this.trans = trans;
    }

    public static void main(String[] args) {


    Car cl = new Car("Auto");
    Car c2 = new Car("4W", 150, "Manual");
System.out.println (cl.type + " " + cl.maxSpeed + " " + cl.trans);
System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);

}}