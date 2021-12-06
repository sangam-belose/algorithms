package com.belose.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedExample implements Runnable {
    static AtomicInteger counter = new AtomicInteger(1);

    static void incrementCounter() {
        System.out.println(Thread.currentThread().getName() + "=" + counter.getAndIncrement());
    }

    public void run() {
            while (counter.get() < 100) {
                incrementCounter();
            }
    }

    public static void main(String[] args) {
        SynchronizedExample e1 = new SynchronizedExample();
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e1);

        t1.start();
        t2.start();
    }
}

