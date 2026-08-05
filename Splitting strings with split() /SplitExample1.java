public class SplitExample1 {
    public static void main(String[] args) {
        String str = "Java is easy to learn";

        String[] words = str.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
