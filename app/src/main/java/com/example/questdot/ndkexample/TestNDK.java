package com.example.questdot.ndkexample;

/**
 * Created by HP on 17/7/2016.
 */
public class TestNDK {
    static{
        System.loadLibrary("MyLibrary");
    }

    public native String getNDKString();

}
