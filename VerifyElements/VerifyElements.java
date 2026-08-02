import java.util.Scanner;

public class VerifyElements {

    public static boolean containsElements(int[] arr, int num1, int num2) {
        boolean foundNum1 = false;
        boolean foundNum2 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                foundNum1 = true;
            }
            if (arr[i] == num2) {
                foundNum2 = true;
            }
        }

        return foundNum1 && foundNum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements separated by space:");
        String input = sc.nextLine();

        String[] str = input.split(" ");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        if (containsElements(arr, 12, 23)) {
            System.out.println("Array contains both 12 and 23.");
        } else {
            System.out.println("Array does not contain both 12 and 23.");
        }

        sc.close();
    }
}
