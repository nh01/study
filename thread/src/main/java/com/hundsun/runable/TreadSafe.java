package com.hundsun.runable;

public class TreadSafe extends Thread {
    private int count = 5;
    public TreadSafe (String name) {
        super();
        this.setName(name);
    }
//    @Override
//    public void run() {
//        super.run();
//        while (count > 0) {
//            count --;
//            System.out.println("由" + this.currentThread().getName() + "计算，count = " + count);
//        }
//    }

    @Override
    synchronized public void run() {
        super.run();
        while (count > 0) {
            count --;
            System.out.println("由" + this.currentThread().getName() + "计算，count = " + count);
        }
    }

    public static void main(String[] args) {
        // 不共享
        /*TreadSafe safe1 = new TreadSafe("A");
        TreadSafe safe2 = new TreadSafe("B");
        TreadSafe safe3 = new TreadSafe("C");
        safe1.start();
        safe2.start();
        safe3.start();*/
        // 线程共享
        TreadSafe ts = new TreadSafe("ts");
        Thread a = new Thread(ts, "AA");
        Thread b = new Thread(ts, "BB");
        Thread c = new Thread(ts, "CC");
        a.start();
        b.start();
        c.start();
        System.out.println("hello world!");
    }
}
