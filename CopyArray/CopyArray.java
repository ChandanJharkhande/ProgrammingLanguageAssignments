public class CopyArray {

    public static void copyArray(int[] source, int[] destination){
        for (int i=0; i<source.length; i++){
            destination[i] = source[i];
        }

    }
    public static void main(String[] args){
        
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = new int[arr1.length];

        copyArray(arr1, arr2);

        System.out.println("Copied Array : ");
        for (int i=0; i<arr2.length;i++){
            System.out.println(arr2[i]+"");
        }

    }
}
