package com.hundsun.runable;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("myRunnable");
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("hello world!");
    }
}
