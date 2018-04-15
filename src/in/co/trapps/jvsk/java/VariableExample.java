package in.co.trapps.jvsk.java;

/**
 * @author Akash Patra
 */
public class VariableExample {
    final int x = 1;
    int y = 2;

    /**
     * Read Only Variables (final) Initialization
     */
    public void initReadOnlyVariable() {
        final char a = 'A'; // Char type
        final int b = a; // Char to Int
        final String c = "Java"; // String

        System.out.println("Read Only Variable -> a: " + a + ", b: " + b + ", c: " + c);
    }

    /**
     * Mutable Variables Initialization
     */
    public void initMutableVariable() {
        char a = 'A'; // Char type
        int b = a; // Char to Int immediate assignment
        String c = "Java"; // String
        System.out.println("Mutable Variable -> a: " + a + ", b: " + b + ", c: " + c);

        a = 'B';
        b = a;
        c = "Java is a Champion";
        System.out.println("Mutable Variable (After Change) -> a: " + a + ", b: " + b + ", c: " + c);
    }

    /**
     * Access Instance Variable (val & var)
     */
    public void accessInstanceVariable() {
        System.out.println("Instance Variable -> x: " + x + ", y: " + y);
        y += 1; // Increment Mutable Variable
        System.out.println("Instance Variable (After Change) -> x: " + x + ", y: " + y);
    }
}
