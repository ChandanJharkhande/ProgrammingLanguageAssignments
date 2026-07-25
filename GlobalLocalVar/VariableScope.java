public class VariableScope {
    //Global (Instance) Variable
    int number = 100;


    public void display(){
        //Local Variable
        int number = 200;

        System.out.println("Local Variable :"+number);

        System.out.println("Global Variable :"+this.number);
    }

    public static void main(String[] args){

        VariableScope obj = new VariableScope();
        obj.display();

    }
}
