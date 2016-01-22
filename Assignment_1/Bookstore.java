import java.util.Scanner;


public class Bookstore {

    public static void main(String[] args) {

        boolean custormers = false;

        Scanner keyboard = new Scanner(System.in);


        do {
            System.out.println("Is there another customer in line? Press 1 for yes and 2 for no.");
            int moreCustomers = keyboard.nextInt();

            if (moreCustomers == 1) {
                custormers = true;
            } else {
                System.exit(0);
            }
        }

    }
}