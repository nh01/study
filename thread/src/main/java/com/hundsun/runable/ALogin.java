package com.hundsun.runable;

public class ALogin extends Thread{
    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
