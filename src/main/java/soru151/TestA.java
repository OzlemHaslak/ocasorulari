package soru151;

public class TestA {

    public static void main(String[] args) {
        Alpha refl = new Alpha (100);
        Alpha ref2 = new Alpha (50);
        Alpha ref3 = new Alpha (125);
        refl.doPrint() ;
        ref2.doPrint();
        ref3.doPrint() ;
    }
}
