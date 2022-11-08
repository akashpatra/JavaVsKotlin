package com.trapps.jvsk.coursera.control_structures;

import java.io.IOException;

/**
 * @author Akash Patra
 */
public class CS {

    public static void main(String[] args) {
        exceptionTest();
    }

    private static void exceptionTest() {
        try {
            ExceptionsKt.foo();
        } catch (IOException e) {

        }
    }
}
