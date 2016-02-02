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
        
        boolean customer;
        
            // 1 - Create a new cart
         Cart cart = new Cart();
            
         customer = b.moreCustomers();
            
         b.showInventory();
         b.chooseFromMenu();
         
         while(b.moreCustomers()) {
            
              cart.addABook();
              cart.removeABook();
              cart.addBookmarks();
              cart.removeBookmarks();
              cart.addPaintings();
              cart.removeAPainting();
        }
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
    
    public int chooseFromMenu() {
        System.out.println("What would you like to order today?");
        System.out.println("1 - Buy Books - $5.00 each");
        System.out.println("2 - Buy Bookmarks - $1 each, $5 for six-pack");
        System.out.println("3 - Buy Paintings of Books - $100 each");
        System.out.println("4 - See current order");
        System.out.println("5 - Checkout");
        
        boolean validAnswer = false;
        int choice = keyboard.nextInt();
        do {
            // Check what customer has said
            int input = keyboard.nextInt();
            switch (input) {
                //check what the input is
                case 1:
                    // They said 1
                    validAnswer = true;
                    System.out.println("How many books do you want to buy? > " + choice);
                    break;
                case 2:
                    // They said 2
                    validAnswer = true;
                    System.out.println("How many bookmarks do you want to buy? > " + choice);
                    break;
                case 3:
                    validAnswer = true;
                    System.out.println("How many paintings do you want to buy? > " + choice);
                    break;
                case 4:
                    validAnswer = true;
                    System.out.println("Your current order is > " + choice);
                    break;
                case 5:
                    validAnswer = true;
                    System.out.println("Checkout.");
                    break;
                default:
                    // They said something else than 1, 2, 3, 4, or 5
                    validAnswer = false;
                    break;
            }
        }
              while (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5);
             return choice;
    }
}
        
