import java.util.Scanner;

public class MissingNumber {

    // Function to find the missing number
    public static int findMissingNumber(int[] arr) {
        int expected = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != expected) {
                return expected;
            }
            expected++;
        }

        return 100; // If 100 is missing
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size is 99 because one number is missing
        int[] arr = new int[99];

        System.out.println("Enter 99 sorted numbers (1 to 100) with one missing:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissingNumber(arr);

        System.out.println("Missing Number = " + missing);

        sc.close();
    }
}
