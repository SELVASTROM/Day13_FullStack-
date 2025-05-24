import java.util.ArrayList;
import java.util.Scanner;

public class Reverese {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> inputList=new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("Enter the inputs :");
            String values=s.nextLine();
            inputList.add(values);
        }
        for(int i=inputList.size()-1;i>=0;i--){
            System.out.print(inputList.get(i)+" ");
        }
        s.close();
    }
    
}
