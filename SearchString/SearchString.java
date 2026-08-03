public class SearchString {
    public static void main(String[] args) {

        String str = "Java Programming";

        // Search for a character
        System.out.println("Index of 'P': " + str.indexOf('P'));

        // Search for a substring
        System.out.println("Index of \"Programming\": " + str.indexOf("Programming"));

        // Search starting from a specific index
        System.out.println("Index of 'a' after index 2: " + str.indexOf('a', 2));

        // Search for a character that does not exist
        System.out.println("Index of 'z': " + str.indexOf('z'));
    }
}
