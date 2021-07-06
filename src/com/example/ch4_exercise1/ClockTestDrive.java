package com.example.ch4_exercise1;

class Clock {
    // set it private
    private  String time;

    // set getter as public
    // non-void return
    public String getTime() {
        return time;
    }

    // set setter as public
    public void setTime(String t) {
        time = t;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1234");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
