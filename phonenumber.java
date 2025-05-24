 import java.util.*;
 class phonenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<ArrayList<String>> phoneNumbers = new ArrayList<>();

        System.out.print("Enter number of people: ");
        int peopleCount = s.nextInt();
        s.nextLine(); // clear buffer

        for (int i = 0; i < peopleCount; i++) {
            System.out.print("Enter person " + (i + 1) + " name: ");
            String name = s.nextLine();
            names.add(name);

            System.out.print("How many phone numbers for " + name + "? ");
            int numberCount = s.nextInt();
            s.nextLine(); // clear buffer

            ArrayList<String> numbers = new ArrayList<>();
            for (int j = 0; j < numberCount; j++) {
                System.out.print("Enter phone number " + (j + 1) + ": ");
                String number = s.nextLine();
                numbers.add(number);
            }

            phoneNumbers.add(numbers);
        }

        System.out.println("\n📞 Contact List:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " → " + phoneNumbers.get(i));
        }

        s.close();
    }
}

