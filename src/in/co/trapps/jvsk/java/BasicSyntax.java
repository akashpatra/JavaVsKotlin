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
        variableExamples();
    }

    /**
     * Print Example
     */
    private static void print() {
        System.out.print("Welcome ");
        System.out.println("to Java !!!");
    }

    /**
     * Variable Examples
     */
    private static void variableExamples() {
        System.out.println("\n**** Variable Examples ****\n");
        VariableExample variableEx = new VariableExample();

        // read only variable initialization example
        variableEx.initReadOnlyVariable();

        // Print Line to Create Space
        System.out.println();

        // mutable variable initialization example
        variableEx.initMutableVariable();

        // Print Line to Create Space
        System.out.println();

        // instance variable example
        variableEx.accessInstanceVariable();
    }
}



