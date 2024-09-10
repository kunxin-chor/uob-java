package Topic06_Exceptions;
import java.util.Scanner;

public class L02_RecoverFromError {
    public static void main(String[] args) {
        int x;
        Scanner sc;
        while(true) {
            sc = new Scanner(System.in);
            try {
              
                System.out.print("Enter a number: ");
                x = sc.nextInt();
                sc.nextLine(); // consume buffered /n if program proceeds normally
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
                sc.nextLine(); // consume buffered /n in case of excception
            } finally {
                sc.close();
            }
        }
        System.out.println("Your number is " + x);
    }
}
