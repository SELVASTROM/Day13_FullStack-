import java.util.*;
class Duplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList <String> fruits=new ArrayList<>();
        System.out.println("Enter the count of fruits you have to add :");
        int count=s.nextInt();s.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("enter the fruit name you have to add :");
            String elements=s.nextLine();
            fruits.add(elements);
        }
        ArrayList <String> list=new ArrayList<>();
        for(String without:fruits){
            if(!list.contains(without)){
                list.add(without);
            }
        }
        System.out.println("the original list "+fruits);
        System.out.println("the list without duplicates is "+list);
        s.close();
    }
    
}
