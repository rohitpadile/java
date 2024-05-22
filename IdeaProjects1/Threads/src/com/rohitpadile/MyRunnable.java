package com.rohitpadile;

import static com.rohitpadile.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MYRunnable's Implementation of  of run()");

    }
}
