package com.etna;

public class Main {

    public static void main(String[] args) {
	    /*
	     * La methode toString() sur un objet indique sa class et son hash.
	     * Un hash identique, indique que c'est le même objet
	     */

        // Print object mySingleton
        mySingleton a = mySingleton.getInstance();
        System.out.println("Singleton From   the Main : " + a.toString());

        // Print object mySingleton from otherClass
        otherClass c = new otherClass();

        thirdClass d = new thirdClass();
    }
}
