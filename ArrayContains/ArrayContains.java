import java.util.Scanner;

public class ArrayContains {

    public static boolean contains(int[] arr, int value){
        for (int num : arr){
            if (num == value){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        System.out.print("Enter a number : ");
        int value = sc.nextInt();

        if (contains(arr,value)){
            System.out.println("is present in the array.");
        }else {
            System.out.println("is not present in the array.");
        }
    }
}
