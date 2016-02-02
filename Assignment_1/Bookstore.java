import java.util.Scanner;

public class Bookstore {

    Scanner keyboard;

    public Bookstore() {
        // initialise my scanner
        this.keyboard = new Scanner(System.in);
    }

    public static void main(String[] args) {
        // I create a new point of sale
        Bookstore b = new Bookstore();
        // start selling things

        b.startSelling();
        
        // 2 - show inventory
        b.showInventory();
    }

    public static void startSelling() {
        
        Bookstore b = new Bookstore();
        
        boolean customer = false;
        do {
            // 1 - Create a new cart
            Cart cart = new Cart();
            
            customer = b.moreCustomers();
        }
        //continues while there are more customers to be served
        while (false);
    }

    public boolean moreCustomers() {
        System.out.println("Is there another customer?");
        System.out.println("Press 1 for Yes and 2 for No > ");
        boolean validAnswer = false;
        boolean answer = false;
        do {
            // Check what customer has said
            int input = keyboard.nextInt();
            switch (input) {
                //check what the input is
                case 1:
                    // They said 1
                    validAnswer = true;
                    answer = true;
                    break;
                case 2:
                    // They said 2
                    validAnswer = true;
                    answer = false;
                    break;
                default:
                    // They said something else than 1 or 2
                    validAnswer = false;
                    break;
            }
        }
        //continue to ask the question till a valid answer has been given
        while (!validAnswer);
        // We return the answer
        return answer;
    }

    public void showInventory() {
        System.out.println("What would you like to order today?");
        System.out.println("1 - Buy Books - $5.00 each");
        System.out.println("2 - Buy Bookmarks - $1 each, $5 for six-pack");
        System.out.println("3 - Buy Paintings of Books - $100 each");
        System.out.println("4 - See current order");
        System.out.println("5 - Checkout");
    }
}