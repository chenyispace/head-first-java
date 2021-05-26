package com.example.ch1;

/*
     Ch 1 - Practice 1bb: Edit the code to make it run
*/

public class Exercise1bb {
    public static void main(String[] args) {
        //int x = 1; // comment out as this line will not run through the while loop
        int x = 5;
        while (x>1) {
            x = x-1;
            if(x<3) {
                System.out.println("small x");
            }
        }
    }
}
