public class StaticInInstance {

    // Static variables
    static int a = 10;
    static int b = 20;

    // Instance method
    void display() {
        System.out.println("Static variable a = " + a);
        System.out.println("Static variable b = " + b);
    }

    public static void main(String[] args) {
        StaticInInstance obj = new StaticInInstance();
        obj.display();
    }
}
