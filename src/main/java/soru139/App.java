package soru139;

    public class App {
        int count;
        public static void displayMsg() {
        //    System.out.println("Welcome Visit Count: " + count++); // line nl
        }
        public static void main(String[] args) {
            App.displayMsg();
            displayMsg(); // line n2
        }
}

// count methodun icinde olmadigi icin error veriyor
