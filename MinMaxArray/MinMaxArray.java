

public class MinMaxArray {

    public static void findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i=1 ; i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }

            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Minimum Value = "+min);
        System.out.println("Maximum Value = "+max);
    }

    public static void main(String[] args) {



        int[] arr = {25, 10, 45, 5, 60, 30};
        findMinMax(arr);

    }
}
