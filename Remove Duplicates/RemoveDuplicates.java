import java.util.ArrayList;
import java.util.Scanner;

    public class RemoveDuplicates {

        // Method to remove duplicate elements
        public static void removeDuplicates(ArrayList<Integer> list) {
            ArrayList<Integer> unique = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                if (!unique.contains(list.get(i))) {
                    unique.add(list.get(i));
                }
            }

            System.out.println("Array after removing duplicates:");
            for (int num : unique) {
                System.out.print(num + " ");
            }
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

            removeDuplicates(list);

            sc.close();
        }
    }
