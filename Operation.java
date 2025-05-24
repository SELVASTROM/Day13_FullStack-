import java.util.*;

public class Operation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> input=new ArrayList<>();
        for(int i=1;i<=5;i++){
            System.out.println("Enter the  "+i+" th index of fruit name ");
            String fruit = s.next();
            input.add(fruit); 
        }
        for(String output: input){
            System.out.println("The name of the fruits as you entered is "+output);
        }
        if(input.contains("Apple")){
            System.out.println("your fruit name is present, don't worry. The fruit name is present at the index of " + input.indexOf("Apple"));
        }else{
            System.out.println("Sorry ! your entered fruit name is not presented");
        }
        s.close();
    }
    
}
