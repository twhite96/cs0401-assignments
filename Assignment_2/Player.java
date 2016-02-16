import java.io*;
import.java.util.Scanner;

public class Player {
    public static void main(String[] args) throws IOException {
        
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
 
