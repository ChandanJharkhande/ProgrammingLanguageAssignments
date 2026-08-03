public class SubstringExample {
    public static void main(String[] args) {
        String str = "Hello World";

        // Extract from index 6 to the end
        String sub1 = str.substring(6);

        // Extract from index 0 to 5 (end index is excluded)
        String sub2 = str.substring(0, 5);

        System.out.println("Original String: " + str);
        System.out.println("Substring 1: " + sub1);
        System.out.println("Substring 2: " + sub2);
    }
}
