import java.io*;
import.java.util.Scanner;

public class Player {
       private int handsPlayed;
       private double money;
       private int handsWon;

    public Player () {
        handsPlayed = 0;
        money = 0.00;
        handsWon = 0;
    }
    
    public static void createFile(String filename) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("What your name? > ");
        String input = sc.nextLine();
        File file = new File(input);
        
        if(!file.exists()) {
            file.createNewFile(input);   
        }
    }
    
     public static void writeToFile()
     public void setHandsPlayed(int handsPlayed) {
         this.handsPlayed += handsPlayed;
     }
     
     public int getHandsPlayed() {
         return handsPlayed;
     }
     public void setMoney(double money) {
         this.money += money;
     }
     public double getMoney() {
         return money;
     }
     public void getHandsWon (int handsWon) {
         this.handsWon += handsWon;
     }
     public int getHandsWon() {
         return handsWon;
     }

}
 
