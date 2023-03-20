package soru157;

import java.util.Arrays;

public class soru157 {

        public static void main(String[] args) {

            int num[] [] = new int[3][1];
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    num[i][j] = 10;
                    System.out.println(num[i][j]);
                }
            }
            System.out.println(Arrays.deepToString(num));
            //Which option represents the state of the num array after successful
            // completion of the outer loop?
        }
    }
//[[10], [10], [10]]
/*
num[0] [0] =10
num[1] [0] =10
num[2] [0] =10
 */