public class StringLiteralExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2); // true (same object)
    }
}
