import java.util.Scanner;


public class Bookstore {

    public static void main(String[] args) {

        boolean customers = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Is there another customer in line? Press 1 for yes and 2 for no.");
        int moreCustomers = keyboard.nextInt();

        if (moreCustomers == 1) {
            customers = true;
        } else {
            System.exit(0);
        }
        while (true) {
           System.out.println("Books are $5 each. Bookmarks are $1 or a pack of 6 for $5, and painting " +
           "of books are $100 each. There is a tax of 7%.");
           System.out.println("What would you like to order today?");

            String order = keyboard.nextLine();
            
        }
    }
}
