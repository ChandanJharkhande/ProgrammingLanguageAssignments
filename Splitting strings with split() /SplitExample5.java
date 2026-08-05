public class SplitExample5 {
    public static void main(String[] args) {
        String str = "A-B-C-D";

        String[] result = str.split("-", 2);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
