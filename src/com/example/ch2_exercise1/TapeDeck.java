package com.example.ch2_exercise1;

class TapeDeck {
    boolean canRecord = false;

    void playTape() {
        System.out.println("Tape playing ");
    }

    void recordTape() {
        System.out.println("Tape recording");
    }
}

class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck(); // make an object
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}


