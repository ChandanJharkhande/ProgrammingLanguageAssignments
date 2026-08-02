import java.util.Scanner;

public class DifferenceLargestSmallest {

    // Function to find the difference
    public static int findDifference(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements separated by space:");
        String input = sc.nextLine();

        String[] values = input.split(" ");
        int[] arr = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        int difference = findDifference(arr);

        System.out.println("Difference between largest and smallest value: " + difference);

        sc.close();
    }
}
