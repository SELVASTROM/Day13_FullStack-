import java.util.*;
class Valueee
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> input=new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("enter the "+i+" th index value");
            int values =s.nextInt();
            input.add(values);
        }
        for(int Print: input ){
            System.out.println("the values in array is "+Print);
        }
        input.remove(2);
        System.out.println("the remaning values are "+input);
        s.close();
    }
}