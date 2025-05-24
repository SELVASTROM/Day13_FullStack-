import java.util.*;

class Multiple {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> inputList=new ArrayList<>();
        int count=s.nextInt();
        for(int i=1;i<=count;i++){
            System.out.println("Enter the numbers you have to add from the index "+i);
            int num = s.nextInt();
            inputList.add(num);
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
