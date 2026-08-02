import java.util.Scanner;

  public class SecondLargestNumber {

        public static int findSecondLargest(int[] arr) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            return secondLargest;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter array elements separated by spaces:");
            String input = sc.nextLine();

            String[] values = input.split(" ");
            int[] arr = new int[values.length];

            for (int i = 0; i < values.length; i++) {
                arr[i] = Integer.parseInt(values[i]);
            }

            int secondLargest = findSecondLargest(arr);

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("Second largest element does not exist.");
            } else {
                System.out.println("Second largest element = " + secondLargest);
            }

            sc.close();
        }
  }

