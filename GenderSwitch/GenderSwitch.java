import java.util.Scanner;

public class GenderSwitch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Gender (M/F) : ");
        char gender = sc.next().charAt(0);

        switch (Character.toUpperCase(gender)){
            case 'M':
                System.out.println("Male");
                break;

            case 'F':
                System.out.println("Female");
                break;

            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}
