package com.etna;

/**
 * Created by crystal on 22/01/2017.
 */
public class thirdClass {
    public thirdClass() {
        mySingleton d = mySingleton.getInstance();
        System.out.println("Singleton From thirdClass : " + d.toString());
    }
}
