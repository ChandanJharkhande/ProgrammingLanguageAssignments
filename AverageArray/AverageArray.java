public class AverageArray {

    public static double calculateAverage(int[] arr){
        int sum = 0;
        for (int i=0;i< arr.length;i++){
            sum =sum + arr[i];
        }

        return sum/ arr.length;
    }


    public static void main(String[] args){

        int[] numbers = {10,20,30,40,50};
        double average = calculateAverage(numbers);
        System.out.println("Average ="+average);

    }
}
