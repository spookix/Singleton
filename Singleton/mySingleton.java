package com.etna;

/**
 * Created by crystal on 22/01/2017.
 */
public class mySingleton {
    private static mySingleton instance;

    public static synchronized mySingleton getInstance(){
        if(instance == null){
            instance = new mySingleton();
        }
        return instance;
    }

    private mySingleton() {
        // Do nothing
    }
}
