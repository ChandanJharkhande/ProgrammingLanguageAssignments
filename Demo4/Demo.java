class Demo {

    // Static method
    static void display() {
        System.out.println("This is a static method.");
    }

    // Instance method
    void show() {
        System.out.println("This is an instance method.");
        display();   // Calling static method
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
}
