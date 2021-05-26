package com.example.ch1;

/*
     Ch 1 - Practice 1b: Edit the code to make it run
*/

public class Exercise1b {
    public static void main(String[] args) {
        int x = 1;
        while (x<10) {
            x = x+1; // Add a line here to prevent while loop always true
            if(x>3) {
                System.out.println("big x");
            }
        }
    }
}

