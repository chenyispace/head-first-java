package com.example.ch5_exercise1;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        //  How to test
        //  Instantiate a SimpleDotCom object
        SimpleDotCom dot = new SimpleDotCom();

        //  Assign it a location (an array of 3 ints, like {2,3,4}
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        //  Invoke the checkYourself() method passing if the fake user guess
        String userGuess = "2";                         // create a fake user
        String result = dot.checkYourself(userGuess);   // get the result based on fake user guess

        //  Print out the result to see if it's correct ("passed" or "failed")
        String testResult = "failed";

        if(result.equals("hit")) {
            System.out.println("passed");
        }
        System.out.println(testResult);

    }
}
