import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);        
        
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        String customerChoice = scan.nextLine().toLowerCase();
        
        // Capitalize the first letter of the customer's choice
        customerChoice = customerChoice.substring(0, 1).toUpperCase() + customerChoice.substring(1);

        boolean found = false;
        for (int i = 0; i < store.length; i++) {
            if(store[i].equals(customerChoice)){
                // Task 2 here
                System.out.println("\nWe have that in aisle: "+ i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Sorry, we don't sell "+ customerChoice+" here.");
        }
        
        scan.close();
    }
}
