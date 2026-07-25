public class ArithmeticOperations {
    static void add(int a, int b){
        System.out.println("Addition :" + (a+b));
    }

    static void Subtract(int a, int b){
        System.out.println("Subtraction :"+(a-b));

    }

    static void Multiply(int a, int b){
        System.out.println("Multiplication :"+(a*b));
    }

    static void Divide(int a, int b){
        if (b != 0){
            System.out.println("Divition :"+(a/b));

        }else {
            System.out.println("Division by zero is not allowed");
        }
    }
    public static void main(String[] args){

        int num1 = 40;
        int num2 = 20;

        add(num1,num2);
        Subtract(num1,num2);
        Multiply(num1,num2);
        Divide(num1,num2);


    }
}
