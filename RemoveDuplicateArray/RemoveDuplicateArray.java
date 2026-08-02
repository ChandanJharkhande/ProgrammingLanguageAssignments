import java.util.Scanner;

public class RemoveDuplicateArray {

    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;

        System.out.println("Enter array elements (-1 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == -1)
                break;

            arr[count] = num;
            count++;
        }

        int[] input = new int[count];
        for (int i = 0; i < count; i++) {
            input[i] = arr[i];
        }

        int[] newArray = removeDuplicates(input);

        System.out.println("Array after removing duplicates:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
