package com.hundsun.runable;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Run {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        ALogin a = new ALogin();
//        BLogin b = new BLogin();
//        a.start();
//        b.start();
        String encode = URLEncoder.encode("GBK编码", "GBK");
        System.out.println("乱码" + encode);
        String decode = URLDecoder.decode(encode, "GBK");// GBK解码
        System.out.println(decode);
    }
}
