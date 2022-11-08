package com.trapps.jvsk.java;

/**
 * @author Akash Patra
 */
public class StringTemplateExample {

    /**
     * String.format
     */
    public void showStringFormat() {
        int a = 20;
        final String t1 = String.format("Amy age is %d", a);
        System.out.println(t1);

        a = 25;
        final String t2 = String.format("%s, now is %d.", t1.replace("is", "was"), a);
        System.out.println(t2);
    }
}
