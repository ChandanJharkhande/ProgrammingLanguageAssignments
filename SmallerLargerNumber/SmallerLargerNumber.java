import java.util.Scanner;


public class SmallerLargerNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Larger number :"+a);
            System.out.println("Smaller number :"+b);

        }else if(b>a){
            System.out.println("Larger number :"+b);
            System.out.println("Smaller number :"+a);

        }else {
            System.out.println("Both numbers are equal.");
        }
        sc.close();

    }
}
