package com.example.ch5_exercise1;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        // GET the locations as an int array parameter
        // ASSIGN the cell locations parameter to the cell locations instance variable
        locationCells = locs;
    }
    public String checkYourself(String stringGuess) {
        // GET the user guess as a String parameter
        // CONVERT the user guess to an int
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        // REPEAT with each of the location cells in the int array
        for (int cell : locationCells) {
            // COMPARE the user guess to the location cell
            // IF the user guess matches
            // INCREMENT the number of hits
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        // FIND OUT if it was the last location cell
        // IF NUmber hits 3 (the last location), return kill as the result
        // ELSE  it was not a kill, return hit
        // END IF
        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        // ELSE the user guess did not match, so return "miss" -> defined at the start
        // END repeat
        System.out.println(result);
        return result;
    }
}
