public class SplitExample4 {
    public static void main(String[] args) {
        String str = "Java   Python   C++";

        String[] languages = str.split("\\s+");

        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}
