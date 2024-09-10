package Topic06_Exceptions;

import java.util.Scanner;

public class L03_SpecificExceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter two numbers: ");
                int number1 = sc.nextInt();  // we have use try/catch when the exception is caused by proccess outside of our control 
                int number2 = sc.nextInt();
                // if possible, use if/else to prevent exceptions
                if (number2 !=0) {
                    System.out.println(number1 / number2);
                }
                break;
               
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please make sure you are entering valld integers");
            } catch (java.lang.ArithmeticException e) {
                System.out.println("Division by zero");
            } catch (Exception e) {
                System.out.println("Something went wrong, IDK");
            }
        }
      
        
    }   
}
