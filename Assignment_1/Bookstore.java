import java.util.Scanner;


public class Bookstore {

    public static void main(String[] args) {
        
        Bookstore b = new Bookstore();
        customers();
        b.showInventory();
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

       System.out.println("What would you like to order today?");
        System.out.println("1 - Buy Books - $5.00 each");
        System.out.println("2 - Buy Bookmarks - $1 each, $5 for six-pack");
        System.out.println("3 - Buy Paintings of Books - $100 each");
        System.out.println("4 - See current order");
        System.out.println("5 - Checkout");
    }

    public int order() {
        Scanner keyboard = new Scanner(System.in);

        int numBooks = 0;
        int numBookmarks = 0;
        int numPaintings = 0;

        numBooks = keyboard.nextInt();
        