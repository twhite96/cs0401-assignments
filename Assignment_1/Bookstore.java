import java.util.Scanner;


public class Bookstore {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean moreCustomers = false;

        int numBooks = 0;
        int numBookmarks = 0;
        int numPaintings = 0;


        do {
            System.out.print("Is there another customer? Press 1 for Yes and 2 for No > ");
            int foo = keyboard.nextInt();

            if (foo == 2) {
                moreCustomers = false;
            } else if (foo == 1) {
                System.out.println("Books are $5 each. Bookmarks are $1 or a pack of 6 for $5, and painting " +
                        "of books are $100 each. There is a tax of 7%.");

                System.out.println("What would you like to order today? Please enter a valid option, 1 through 5 > ");

                String order = keyboard.nextInt();
                System.out.println("Currently in cart: " + order);
                moreCustomers = true;
            } else {
                System.out.println("Enter 1 or 2!");
                moreCustomers = true;
            }

        } while (moreCustomers);
    }
}
