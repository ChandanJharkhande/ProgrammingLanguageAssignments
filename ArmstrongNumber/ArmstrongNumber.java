import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num, originalNum, remainder ;
        int digits = 0;
        int result = 0;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        originalNum = num;

        while (originalNum!=0){
            digits++;
            originalNum = originalNum/10;
        }

        originalNum = num;

        while (originalNum !=0){
            remainder = originalNum % 10;
            result += (int) Math.pow(remainder,digits);
            originalNum = originalNum/10;
        }

        if (result == num){
            System.out.println(num+" : is an Armstrong number.");
        }else {
            System.out.println(num+ " : is not an Armstrong number.");
        }
        sc.close();
    }
}
