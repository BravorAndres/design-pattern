package com.singleton.app;

/**
 * Hello world!
 * @user: Andres
 *
 */


public class App {
    
    public static void main( String[] args ){
        ConfigurationSingle singleA = ConfigurationSingle.getInstance();
        ConfigurationSingle singleB = ConfigurationSingle.getInstance();
        System.out.println("A: "+singleA.toString());
        System.out.println("B: "+singleB.toString());

        singleA.setAppName("Singleton pattern");
        singleB.setAppVersion("1.0x");

        singleA = null;

        System.out.println(singleB);


    }
}
