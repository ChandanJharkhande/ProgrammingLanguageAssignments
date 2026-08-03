public class Demo {

    // 2 Static Variables
    static String college = "Bu College";
    static int year = 2023;

    // 2 Instance Variables
    String name;
    int age;

    // Constructor
    Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 1st Static Method
    static void displayCollege() {
        System.out.println("College: " + college);
    }

    // 2nd Static Method
    static void displayYear() {
        System.out.println("Year: " + year);
    }

    // 1st Instance Method
    void displayName() {
        System.out.println("Name: " + name);
    }

    // 2nd Instance Method
    void displayAge() {
        System.out.println("Age: " + age);
    }

    // Main Method
    public static void main(String[] args) {

        // Creating an object
        Demo obj = new Demo("Chandan", 25);

        // Calling Static Methods
        displayCollege();
        displayYear();

        // Calling Instance Methods
        obj.displayName();
        obj.displayAge();
    }
}
