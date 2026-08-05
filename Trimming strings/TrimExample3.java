public class TrimExample3 {
    public static void main(String[] args) {
        String str = "   Welcome   ";
        String result = str.trim();

        System.out.println(result);
        System.out.println("Length before trim: " + str.length());
        System.out.println("Length after trim: " + result.length());
    }
}
