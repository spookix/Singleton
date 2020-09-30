package com.etna;

/**
 * Created by crystal on 22/01/2017.
 */
public class otherClass {
    public otherClass() {
        mySingleton b = mySingleton.getInstance();
        System.out.println("Singleton From otherClass : " + b.toString());
    }
}
