import java.util.*;

class problem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> inputList=new ArrayList<>();
        int count=s.nextInt();
        for(int i=0;i<count;i++){
            System.out.println("Enter the numbers you have to add ");
            inputList.get(i);
        }
        for(int output:inputList){
            if(output%2==0){
                System.out.println("The number is even bro!! ");
            }else{
                System.out.println("The number is odd bro!!");
            }

        }
        s.close();

    }
    
}
