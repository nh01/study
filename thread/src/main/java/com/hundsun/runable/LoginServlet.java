package com.hundsun.runable;

public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    public static void doPost(String username, String password){
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username = " + usernameRef + ";password = " + passwordRef);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
