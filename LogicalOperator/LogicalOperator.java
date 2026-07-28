public class LogicalOperator {
    public static void main(String[] args){
        
        int age = 25;
        boolean hasId = true;


        if(age >= 18 && hasId ){
            System.out.println("Allowed to Enter");
        }if(age<18 || !hasId){
            System.out.println("Not allowed to Enter");

        }
    }
}
