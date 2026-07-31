import java.util.Scanner;

public class RemoveElement {

    public static int[] removeElement(int[] arr, int element) {
        int count = 0;

        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }

        if (count == 0) {
            return arr;
        }

        int[] newSrr = new int[arr.length-count];
        int index = 0;

        for (int num:arr){
            if (num!=element){
                newSrr[index++] = num;
            }
        }

        return newSrr;


    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        System.out.print("Remove Element : ");
        int element = sc.nextInt();

        int[] result = removeElement(arr, element);
        System.out.println("Array after removing "+element+" :");

        for (int num: result){
            System.out.println(num+"");
        }
    }
}
