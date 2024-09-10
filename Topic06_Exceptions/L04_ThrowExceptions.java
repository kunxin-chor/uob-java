package Topic06_Exceptions;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class L04_ThrowExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divide: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int result = 0;
        try {
            result = divideTwoNumbers(number1, number2);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        foobar(10);
      
        // if (number2 == 0) {
        //     throw new ArithmeticException("Cannot divide by 0 please retry");
        // }
        System.out.println(result);
    }

    public static int divideTwoNumbers(int x, int y) {
        if (y == 0) {
            // throwing an exception cause the current method to be terminated
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return x/y;
    }

    // the `throws IllegalArgumentException` means there's a chance
    // that this method will throw that particular argument
    public static int foobar(int x) throws IllegalArgumentException {
        // if x is 10 we will throw an illegal argument exception
        if (x==10) {
            throw new IllegalArgumentException();
        }

        return x * x;
    }
}
