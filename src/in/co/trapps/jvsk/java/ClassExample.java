package in.co.trapps.jvsk.java;

/**
 * @author Akash Patra
 */
public class ClassExample {
    private String name;

    public ClassExample(String name) {
        this.name = name;
        System.out.println("Constructor Called with Name: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setter Called with Name: " + name);
    }
}
