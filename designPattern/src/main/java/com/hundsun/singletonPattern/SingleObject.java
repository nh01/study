package com.hundsun.singletonPattern;

/**
 * 单例模式
 */
public class SingleObject {



    private SingleObject(){}

    /**
     * 简单创建
     * @return
     */
//    private static SingleObject instance = new SingleObject();
//    public static SingleObject getInstance() {
//        return instance;
//    }

    /**
     * 饿汉式
     */
//    private static SingleObject instance;
//    public static SingleObject getInstance(){
//        if (instance == null) {
//            instance = new SingleObject();
//        }
//        return instance;
//    }

    /**
     * 懒汉式
     */
    private static SingleObject instance;
    public static synchronized SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
