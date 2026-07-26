public class IncrementDecrement {

    static void increment(){
        int a = 10;
        System.out.println("Before Increment :"+a);
        a++;
        System.out.println("After Increment :"+a);

    }

    static void decrement(){
        int a = 10;
        System.out.println("Before Increment :"+a);
        a--;
        System.out.println("After Increment :"+a);


    }
    public static void main(String[] args) {
        increment();
        decrement();

    }
}
