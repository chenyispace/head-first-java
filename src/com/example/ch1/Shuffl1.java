package com.example.ch1;
/*
         Ch 1 - Practice 3: Shuffle the code to print 'a-b c-d'
*/
public class Shuffl1 {
    public static void main(String[] args) {

        int x = 3;
        while (x > 0){
            if (x > 2)
            {
                System.out.print('a');
            }
            x = x - 1;
            System.out.print('-');

            if(x == 2){
                System.out.print("b c");
            }

            if(x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
