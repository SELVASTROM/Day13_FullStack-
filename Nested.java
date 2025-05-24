import java.util.*;
class Nested {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> Numberofstudents=new ArrayList<>();
        ArrayList<ArrayList<Integer>> Numberofsubjects=new ArrayList<>();
        
        System.out.print("Enter how many students you have to enter sensei :");
        int count=s.nextInt();
        Numberofstudents.add(count);
        ArrayList<Integer> Subjects=new ArrayList<>();
        for(int i=1;i<=count;i++){
            System.out.println("Enter the how many  subjects  ");
            int  marks=s.nextInt();
            Subjects.add(marks);
        }
        for(int i=0;i<count;i++){
            ArrayList<Integer> studentMarks = new ArrayList<>();
            int total = 0;
            for(int j=0;j<Subjects.get(i);j++){
                System.out.println("Enter the marks for student "+(i+1)+" in subject "+(j+1)+":");
                int mark = s.nextInt();
                studentMarks.add(mark);
                total += mark;
            }
            Numberofsubjects.add(studentMarks);
            System.out.println("Total marks for student "+(i+1)+": " + total);
        }
s.close();

    }
    
}
