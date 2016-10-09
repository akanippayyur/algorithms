package com.app.designpatterns;

/**
 * Created by akanippayyur on 10/9/16.
 */
class Singleton {

    private static Singleton instance;

    private Singleton() {
        // Private constructor
    }

    public static synchronized Singleton getInstance(){
        if(null == instance) {
            instance = new Singleton();
        }

        return instance;
    }

    public static void doPrint() {
        System.out.println("Hello World!");
    }
}

public class Singleton_Method1 {
    public static void main(String args[]) {
        Singleton foo = Singleton.getInstance();
        foo.doPrint();
    }
}
