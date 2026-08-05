public class SplitExample3 {
    public static void main(String[] args) {
        String date = "05-08-2026";

        String[] parts = date.split("-");

        System.out.println("Day: " + parts[0]);
        System.out.println("Month: " + parts[1]);
        System.out.println("Year: " + parts[2]);
    }
}
