package com.example.ch3_exercise4;

/* ch3 - Exercise 4: Pool Puzzle */

class Traingle {
    double area;
    int height, length;

    public static void main(String[] args) {
        Traingle[] ta = new Traingle[4];
        int x = 0;

        while (x < 4) {
            ta[x].setArea();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;

            System.out.println("triangle " + x + " , area ");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }

        x = 27;
        Triangle t5 = ta[2];

    }

    // Method: setArea
    // Return: area
    void setArea () {
        area  = (height * length) / 2;
    }
}
