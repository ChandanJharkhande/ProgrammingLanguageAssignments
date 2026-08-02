import java.util.Scanner;

    public class CommonValues {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr1 = new int[100];
            int[] arr2 = new int[100];
            int size1 = 0, size2 = 0;

            System.out.println("Enter elements of first array (-1 to stop):");
            while (true) {
                int value = sc.nextInt();
                if (value == -1)
                    break;
                arr1[size1] = value;
                size1++;
            }

            System.out.println("Enter elements of second array (-1 to stop):");
            while (true) {
                int value = sc.nextInt();
                if (value == -1)
                    break;
                arr2[size2] = value;
                size2++;
            }

            System.out.println("Common values are:");

            for (int i = 0; i < size1; i++) {
                boolean printed = false;

                for (int k = 0; k < i; k++) {
                    if (arr1[i] == arr1[k]) {
                        printed = true;
                        break;
                    }
                }

                if (printed)
                    continue;

                for (int j = 0; j < size2; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i] + " ");
                        break;
                    }
                }
            }

            sc.close();
        }
    }

