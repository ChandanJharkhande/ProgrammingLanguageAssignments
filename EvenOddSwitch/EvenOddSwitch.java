import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        switch (num %2){
            case 0:
                System.out.println(num+" : is EVEN");
                break;

            case 1:
                System.out.println(num+" : is ODD");
        }

        sc.close();


    }
}
