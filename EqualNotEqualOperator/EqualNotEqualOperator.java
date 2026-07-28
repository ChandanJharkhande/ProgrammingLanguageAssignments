import java.util.Scanner;

public class EqualNotEqualOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Both numbers are equal.");

        }else {
            System.out.println("Both numbers are not equal.");
        }

        if (num1 != num2){
            System.out.println("Numbers are not equal.");
        }else {
            System.out.println("Numbers are equal.");
        }
    }
}
