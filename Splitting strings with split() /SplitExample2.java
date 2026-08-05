public class SplitExample2 {
    public static void main(String[] args) {
        String str = "Apple,Banana,Mango,Grapes";

        String[] fruits = str.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
