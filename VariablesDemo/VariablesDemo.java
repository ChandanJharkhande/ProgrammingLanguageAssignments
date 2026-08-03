public class VariablesDemo {

    // Static variables
    static int a = 10;
    static String name = "Java";

    // Instance variables
    int b = 20;
    String city = "Bhopal";

    public static void main(String[] args) {

        // Print static variables directly
        System.out.println("Static Variable a = " + a);
        System.out.println("Static Variable name = " + name);

        // Create object to access instance variables
        VariablesDemo obj = new VariablesDemo();

        // Print instance variables
        System.out.println("Instance Variable b = " + obj.b);
        System.out.println("Instance Variable city = " + obj.city);
    }
}
