package soru152;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class soru152 {
    public static void main(String[] args) {
        List<String> ist = Arrays.asList("A", "B", "C", "D");
         Iterator<String> itr = ist. iterator () ;
        while(itr.hasNext()) {
            String e = itr.next();
            if (e == "C") {
                break;
            } else {
              //  continue;
                System.out.print(e);
            }
        }}}