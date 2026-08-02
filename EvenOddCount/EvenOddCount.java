import java.util.Scanner;
import java.util.ArrayList;

public class EvenOddCount {

    // Method to count even and odd numbers
    public static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of Even elements: " + even);
        System.out.println("Number of Odd elements: " + odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter array elements (type -1 to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            list.add(num);
        }

        // Convert ArrayList to array
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        // Call the method
        countEvenOdd(arr);

        sc.close();
    }
}
