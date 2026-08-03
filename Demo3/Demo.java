public class Demo {

    // Instance Method 1
    void display() {
        System.out.println("Instance Method 1");
    }

    // Instance Method 2
    void show() {
        System.out.println("Instance Method 2");
    }

    // Static Method 1
    static void staticMethod1() {
        System.out.println("Static Method 1");

        // Creating object to call instance methods
        Demo obj = new Demo();
        obj.display();
        obj.show();
    }

    // Static Method 2
    static void staticMethod2() {
        System.out.println("Static Method 2");

        // Creating object to call instance methods
        Demo obj = new Demo();
        obj.display();
        obj.show();
    }

    public static void main(String[] args) {
        staticMethod1();
        staticMethod2();
    }
}
