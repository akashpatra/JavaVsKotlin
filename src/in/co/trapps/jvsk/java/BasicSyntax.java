package in.co.trapps.jvsk.java;

/**
 * Basic Syntax in Java
 *
 * @author Akash Patra
 */
public class BasicSyntax {

    /**
     * Main Function
     *
     * @param args
     */
    public static void main(String[] args) {
        // print example
        print();

        // variable initialization example
        initVariable();
    }

    /**
     * Print Example
     */
    private static void print() {
        System.out.print("Welcome ");
        System.out.println("to Java !!!");
    }

    /**
     * Variables Initialization Example
     */
    private static void initVariable() {
        char a = 'A'; // char assignment
        int b = a; // int assignment
        String c = "Java"; // string assignment
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }
}
