package com.trapps.jvsk.java;

/**
 * @author Akash Patra
 */
public class SwitchExample {

    /**
     * Checks the Object passed is 1 or 5 or String or others
     *
     * @param name
     * @return result
     */
    public String checkIntStr(Object name) {
        if (name instanceof Integer) {
            Integer tempInt = (Integer) name;
            switch (tempInt) {
                case 1:
                case 5:
                    return "1 or 5";
                default:
                    return "Not 1 or 5";
            }
        } else if (name instanceof String) {
            return "String";
        }
        return "Not Int or String";
    }
}
