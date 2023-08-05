interface InterfaceJava8 {
    // Static method
    static void staticMethod() {
        System.out.println("I am a static method in Java 8 interface");
    }

    // Default method
    default void defaultMethod() {
        System.out.println("I am a default method in Java 8 interface");
    }

    // Abstract method
    void abstractMethod();
}

public class ImplClass implements InterfaceJava8 {
    // Implementation of the abstract method
    @Override
    public void abstractMethod() {
        System.out.println("I am implementing the abstract method");
    }

    public static void main(String[] args) {
        ImplClass obj = new ImplClass();

        // Invoke the static method using the interface name
        InterfaceJava8.staticMethod();

        // Invoke the default method through the instance
        obj.defaultMethod();

        // Invoke the abstract method through the instance
        obj.abstractMethod();
    }
}
