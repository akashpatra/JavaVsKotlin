package com.trapps.jvsk.java;

/**
 * @author Akash Patra
 */
public class CastingExample {

    /**
     * Check String type and then find String length
     *
     * @param name
     */
    public void stringCast(Object name) {
        if (name instanceof String) {
            int length = ((String) name).length();
            System.out.println("It is a String and of length: " + length);
        }
    }
}
