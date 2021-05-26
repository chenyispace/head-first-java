package com.example.ch1;

/*
     Ch 1 - Practice 1bbb: Edit the code to make it run
*/

public class Exercise1bbb {
    public static void main(String[] args) {    // Added this to run the code below
        int x = 5;
        while (x>1) {
            x = x-1; // Added a condition to stop the loop
            if (x<3) {
                System.out.println("small x");
            }
        }
    }
}
