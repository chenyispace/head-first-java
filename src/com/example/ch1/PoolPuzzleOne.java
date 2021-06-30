package com.example.ch1;

/*
     Ch 1 - Practice 3: Print out below words
     a noise
     annoys
     an oyster
*/
public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;

        while (x < 4) {
            System.out.print("a");    // Common 1
            if(x < 1) { // GIVEN
                System.out.print(" ");  // Diff 1
            }
            System.out.print("n");      // Common 2

            if(x > 1) {
                System.out.print(" oyster");    // Diff 3
                x = x + 2;  // Diff 3
            }

            if(x == 1) { // GIVEN
                System.out.print("noys");   // Diff 2
            }

            if(x < 1) {
                System.out.print("oise");   // Diff 1
            }
            System.out.println(""); // GIVEN
            x = x + 1;              // Common 3
        }
    }
}
