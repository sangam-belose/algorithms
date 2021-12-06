package com.belose.threads;

/**
 * Creation of simple thread
 */
public class SampleThread implements Runnable {

    public void run() {
        System.out.println("Thread implementation");
    }

    public static void main(String[] args) {
        new Thread(new SampleThread()).start();

        new Thread(() -> {
            for(int i = 0; i< 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
