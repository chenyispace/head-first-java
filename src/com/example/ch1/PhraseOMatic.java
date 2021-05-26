package com.example.ch1;

/*
*     Ch 1 - Practice 2: Phrase-O-Matic
 * */
public class PhraseOMatic {
    public static void main(String[] args) {
        // 1) make 3 sets of words to choose from. Add your own
        String [] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to B", "win-win", "frontend",
                "web-based", "pervasive", "smart", "sixsigma", "critical-path", "dynamic"};
        String [] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric",
                "distributed", "clustered", "branded", "outside-the-box", "positioned",
                "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String [] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency",
                "strategy", "mildshare", "portal", "space", "vision", "paradigm", "mission"};

        // 2) find out how many words in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // 3) generate 3 random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // 4) now build a phrase
        String phrase = wordListOne[rand1] + " "
                + wordListTwo[rand2] + " "
                + wordListThree [rand3] + " ";

        System.out.println("What we need is " + phrase);
    }
}
