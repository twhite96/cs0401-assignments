import java.util.Scanner;


public class Bookstore {

    public static void main(String[] args) {

        customers();
        showInventory();
        order();

    public int customers() {

        Scanner keyboard = new Scanner(System.in);

        boolean moreCustomers = false;

        do {
            System.out.print("Is there another customer? Press 1 for Yes and 2 for No > ");
            int foo = keyboard.nextInt();

            if (foo == 2) {
                moreCustomers = false;
            } else if (foo == 1) {
                moreCustomers = true;
            } else {
                System.out.println("Enter 1 or 2!");
                moreCustomers = true;
            }

        } while (moreCustomers);

    public void showInventory() {

        System.out.println("What would you like to order today?" + "1 - Buy Books - $5.00 each" + "2 - Buy Bookmarks - $1 each, $5 for six-pack" +
                "Buy Paintings of Books - $100 each" + "4 - See current order" + "5 Checkout");

    public int order() {
        Scanner keyboard = new Scanner(System.in);

        int numBooks = 0;
        int numBookmarks = 0;
        int numPaintings = 0;

        numBooks = keyboard.nextInt();

    }
    }
}


