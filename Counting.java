import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Character> input =new ArrayList<>();
        System.out.println("Enter the how many loops we have to tried");
        int count=s.nextInt();
        for(int i=0;i<count;i++){
            char values = s.next().charAt(0);
            input.add(values);
        }
        ArrayList<Character> counted=new ArrayList<>();
        for(char ch: input){
            if(!counted.contains(ch)){
                int freq=Collections.frequency(input,ch);
                System.out.println(ch +"-> "+freq);
                counted.add(ch);
            }


        }
        s.close();

   }
    
}
