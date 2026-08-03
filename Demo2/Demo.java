public class Demo {

    // Instance variables
    int a = 10;
    int b = 20;

    // Static method
    static void display() {
        Demo obj = new Demo();   // Create object
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }

    public static void main(String[] args) {
        display();
    }
}
