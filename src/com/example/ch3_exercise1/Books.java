package com.example.ch3_exercise1;

/* ch3 - Exercise 1: Insert code to make the code to run */

class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks  = new Books[3];
        int x = 0;
        // Insert line 16-19: Have to make it an object first
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "The Graphs of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }

    }
}
