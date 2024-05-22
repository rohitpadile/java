package com.rohitpadile;

public class Main {

    public static void main(String[] args) {

        Countdown countdown1 = new Countdown();
        Countdown countdown2 = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown1);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown2);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
//        INTERFERENCE FROM ANOTHER THREAD FOR EACH
//        RACE CONDITION
//        SOME STEPS ARE SKIPPED DUE TO INTERRUPTION
//        BOTH THREAD CONTROLLING THE SAME OBJECT INSTANCE IN THE HEAP
    }
}

class Countdown{
    private int i;
    //USE synchronized keyword to synchronise method handling by threads
    //One way to prevent the race condition
    public void doCountdown() {
        String color;

        switch(Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color =ThreadColor.ANSI_GREEN;
        }
        synchronized (color) {
            for(i=10; i > 0; i--) {
                System.out.println(color+ Thread.currentThread().getName() + ": i =" + i);
            }

        }

    }
}

class CountdownThread extends Thread {
    private Countdown threadCuontdown;

    public CountdownThread(Countdown countdown) {
        threadCuontdown = countdown;
    }

    public void run() {
        threadCuontdown.doCountdown();
    }
}