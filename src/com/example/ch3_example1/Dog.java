package com.example.chap3_example1;

public class Dog {
    String name;
    public void bark() {
        System.out.println(name + " say Ruff!");
    }
    public void eat() {}
    public void chaseCat() {}

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // now make a dog array
        Dog[] mydogs = new Dog[3];

        // and put some dogs in it
        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = dog1;

        // now access the dog using aaray
        mydogs[0].name = "Fred";
        mydogs[1].name = "Marge";

        // What's my dog name?
        System.out.print("last dog name is " );
        System.out.println(mydogs[2].name);

        // now loop thr the array
        // and tell all the dogs to barks
        int x = 0;
        while (x < mydogs.length) {
            mydogs[x].bark();
            x = x + 1;
        }

    }
}
