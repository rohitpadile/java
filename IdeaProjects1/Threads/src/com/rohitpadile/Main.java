package com.rohitpadile;

import static com.rohitpadile.ThreadColor.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "This is running in main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
//        anotherThread.run(); Dont call run method directly - it will run from main
        anotherThread.start();


        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
//                super.run();
                System.out.println(ANSI_RED + "Hello from anonymous clas's implementation of run()");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so i'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted" );
                }
            }

        });
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");

    }
}
