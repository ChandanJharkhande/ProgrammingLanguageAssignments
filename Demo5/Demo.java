public class Demo {

    // Static Methods
    static void staticMethod1() {
        System.out.println("This is Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("This is Static Method 2");
    }

    // Instance Methods
    void instanceMethod1() {
        System.out.println("This is Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("This is Instance Method 2");
    }

    // Main Method
    public static void main(String[] args) {

        // Calling static methods
        staticMethod1();
        staticMethod2();

        // Creating object
        Demo obj = new Demo();

        // Calling instance methods using object
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
