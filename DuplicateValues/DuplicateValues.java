
    import java.util.Scanner;

    public class DuplicateValues {

        // Function to find duplicate values
        public static void findDuplicates(int[] arr) {
            boolean found = false;

            System.out.print("Duplicate values are: ");

            for (int i = 0; i < arr.length; i++) {
                boolean isDuplicate = false;

                // Check if current element has already been printed
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    continue;
                }

                // Check for duplicates
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.print("No duplicate values found.");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter array elements separated by space:");
            String input = sc.nextLine();

            String[] str = input.split(" ");
            int[] arr = new int[str.length];

            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            findDuplicates(arr);

            sc.close();
        }
    }

