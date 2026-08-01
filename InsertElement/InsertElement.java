import java.util.Scanner;

public class InsertElement {
    public static void insertElement(int[] arr, int size, int element, int position){
        for (int i = size; i>position; i--){
            arr[i] = arr[i-1];
        }

        arr[position] = element;

        System.out.println("Array after insertion : ");

        for (int i = 0 ; i<= size; i++){
            System.out.println(arr[i]+"");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int size = sc.nextInt();

        int[] arr = new int[size+ 1];

        System.out.println("Enter array elements : ");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to insert : ");
        int element = sc.nextInt();

        System.out.println("Enter the position (0 to "+size + "):");
        int posotion = sc.nextInt();

        if (posotion <0 || posotion>size){
            System.out.println("Invalid position!");
        }else{
            insertElement(arr, size, element, posotion);
        }
        sc.close();

    }
}
