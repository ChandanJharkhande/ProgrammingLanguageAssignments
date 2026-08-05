public class Main3 {
    public static void main(String[] args) {
        String email = "abc123@gmail.com";

        System.out.println(email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"));
    }
}
