import java.util.Scanner;


public class Bookstore {

    public static void main(String[] args) {

        boolean customers = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("More customers in line? Press 1 for yes and 2 for no. > ");
        int moreCustomers = keyboard.nextInt();

        int numBooks = 0;
        int numBookmarks = 0;
        int numPaintings = 0;

        if (moreCustomers == 1) {
            System.out.println("Books are $5 each. Bookmarks are $1 or a pack of 6 for $5, and painting " +
                    "of books are $100 each. There is a tax of 7%.");
            if (moreCustomers == 1) {
                System.out.println("What would you like to order today?");
                String order = keyboard.nextInt();
                System.out.println("Currently in cart: " + order);
            }


        } else {
            System.exit(0);
        }
    }
}
