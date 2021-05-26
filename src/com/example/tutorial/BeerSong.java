package com.example.tutorial;

/*
    Practice 1:
    Code classic children's favorite "99 bottles of beer"

    99 bottles of beer on the wall, 99 bottles of beer.
    Take one down and pass it around.

    98 bottles of beer on the wall, 98 bottles of beer.
    Take one down and pass it around.

    ...
    1 bottle of beer on the wall, 1 bottle of beer.
    Take one down and pass it around, no more bottles of beer on the wall.
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) word = "bottle"; // singular if there is only 1 bottle

            System.out.println(beerNum + " " + word + " of beer on the wall ");
            System.out.println(beerNum + " " + word + " of beer" );
            System.out.println("Take one down. ");
            System.out.println("Pass it around.");

            beerNum -= 1;

            if (beerNum  == 0) {
                System.out.println("No more bottles of bear on the wall");
            }
        }
    }
}
