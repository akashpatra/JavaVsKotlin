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
        // printExamples examples
        printExamples();

        // variable initialization examples
        variableExamples();

        // null examples
        nullExamples();

        // string examples
        stringTemplateExamples();

        // casting example
        castingExamples();

        // switch examples
        switchExamples();

        // class examples
        classExamples();

        System.out.println("TestingCompareTO: " + (int) 'a' + ", " + (int) 'A');
        System.out.println("TestingCompareTO: " + "a".compareTo("A"));
    }

    /**
     * Print Examples
     */
    private static void printExamples() {
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

    /**
     * Null Examples
     */
    private static void nullExamples() {
        System.out.println("\n**** Null Examples ****\n");
        NullExample nullEx = new NullExample();

        // init nulls to a ref
        nullEx.initNulls();

        // Print Line to Create Space
        System.out.println();

        try {
            // access properties of null ref
            nullEx.accessNulls();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    /**
     * String Template Examples
     */
    private static void stringTemplateExamples() {
        System.out.println("\n**** String Template Examples ****\n");
        StringTemplateExample stringTempEx = new StringTemplateExample();
        stringTempEx.showStringFormat();
    }

    /**
     * Casting Examples
     */
    private static void castingExamples() {
        System.out.println("\n**** Casting Examples ****\n");
        CastingExample castingEx = new CastingExample();
        castingEx.stringCast("Java");
    }

    /**
     * Switch Examples
     */
    private static void switchExamples() {
        System.out.println("\n**** Switch Examples ****\n");
        SwitchExample switchEx = new SwitchExample();
        System.out.println(switchEx.checkIntStr(12.343));
    }

    /**
     * Class Examples
     */
    private static void classExamples() {
        System.out.println("\n**** Class Examples ****\n");
        ClassExample classEx = new ClassExample("Java");
        classEx.setName("Java 2");
    }
}



