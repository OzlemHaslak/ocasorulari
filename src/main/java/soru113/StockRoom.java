package soru113;

public class StockRoom {

    static int stock = 10;
    static int qty = 0;
    public static void purchase( int qty) {stock += qty;}
    public static void sell(int qty) {stock -= qty;}
    public static void printstock(String action) {
        System.out.println(action + ":" + qty + " items. Stock in Hand: " + stock);
    }
    public static void main(String[] args) {
        StockRoom kl = new StockRoom();
        kl.sell (5) ;
        kl.printstock("Sold");
        StockRoom k2 = new StockRoom();
        k2.purchase(5);
        k2.printstock("Purchased");

    }}
