import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,20,30,40,50};

        System.out.print("Enter the element to find : ");
        int element = sc.nextInt();

        int index = -1;

        for (int i=0;i<arr.length;i++){
            if (arr[i] == element){
                index = i;
                break;
            }
        }

        if (index != -1){
            System.out.println("Element found at index :"+index);
        }else {
            System.out.println("Element not found in the array.");
        }
    }
}
