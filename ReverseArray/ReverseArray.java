import java.util.Scanner;

public class ReverseArray {

    public  static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements : ");

        String input = sc.nextLine();

        String[] str = input.split(" ");
        int[] arr = new int[str.length];

        for (int i=0; i<str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        reverseArray(arr);

        System.out.println("Reversed Array");

        for (int num : arr){
            System.out.println(num+"");
        }

        sc.close();



    }
}
