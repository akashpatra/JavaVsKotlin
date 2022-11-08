package com.trapps.jvsk.java;

/**
 * @author Akash Patra
 */
public class NullExample {

    /**
     * No Initialization
     */
    public void initNulls() {
        final String firstName = null;
        String lastName = null;
        System.out.println("Null String -> FirstName: " + firstName + ", LastName: " + lastName);
    }

    /**
     * Access Null Ref
     */
    public void accessNulls() {
        final String name = null;

        // Safe way to avoid NPE
        if (null != name) {
            final int length = name.length();
            System.out.println("Access Nulls -> Name: " + name + ", Length of Name: " + length);
        }

        // To get NPE
        final int length2 = name.length();
    }
}
