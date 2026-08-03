import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name :");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name :");
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName;

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + fullName);
    }
}
