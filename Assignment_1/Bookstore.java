import java.util.Scanner;


public class Bookstore {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean customers = false;

        int numBooks = 0;
        int numBookmarks = 0;
        int numPaintings = 0;


        do {
            System.out.print("Is there another customer? Press 1 for Yes and 2 for No > ");
            int moreCustomers = keyboard.nextInt();
            
            if (moreCustomers == 2) {
                customers = false;
            } else if (moreCustomers == 1) {
                System.out.println("Books are $5 each. Bookmarks are $1 or a pack of 6 for $5, and painting " +
                        "of books are $100 each. There is a tax of 7%.");
                customers = true;
            } else if (moreCustomers == 1) {
                System.out.println("What would you like to order today?");
                String order = keyboard.nextInt();
                System.out.println("Currently in cart: " + order);
                customers = true;
            } else {
                System.out.println("Enter 1 or 2!");
                customers = true;
            }

        } while (customers);
    }
}
