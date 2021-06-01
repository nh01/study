package com.hundsun.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread!");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("hello world");
    }
}
