package Topic06_Exceptions;
import java.util.Scanner;


public class L01_AskForNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        // if you have a try block, you must have a catch
        try {
            // if any lines of code in a try block causes an exception
            // (i.e throws an exception)
            int number = sc.nextInt();
            System.out.println("Number = " + number);
        } catch (Exception e) {
            // program execution will go to the first line in the catch block
            System.out.println("Oops, some error");
        } finally {
            // will always executes at the end of the try/catch block
            // good place to close files or to close a network connection
            // (i.e deallocating resources, or cleanup)
            System.out.println("Program ends");
            sc.close();
        }
      
    }
}
