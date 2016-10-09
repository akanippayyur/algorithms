package com.app.designpatterns;

/**
 * Created by akanippayyur on 10/9/16.
 */
class Singleton_1 {

    private static Singleton_1 instance = new Singleton_1();

    private Singleton_1() {
        // Private constructor
    }

    public static Singleton_1 getInstance(){
        return instance;
    }

    public static void doPrint() {
        System.out.println("Hello World!");
    }
}

public class Singleton_Method2 {
    public static void main(String args[]) {
        Singleton_1 foo = Singleton_1.getInstance();
        foo.doPrint();
    }
}
