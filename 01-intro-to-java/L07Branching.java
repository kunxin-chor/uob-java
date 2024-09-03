import java.util.Scanner;

public class L07Branching {
    public static void main(String[] args) {
        // ask the user to enter a password
        // assume the password is rotiprata123
        Scanner sc = new Scanner(System.in);
         
        //String password = sc.next();  // capture the input as string, but enter and spaces cound as end of line (EOL)
        
        String password = sc.nextLine(); // capture the input as string, all the way up to the \n character
        System.out.println("Password = " + password);

        // use .equals() method 
        // Strings are objects, not primitive values (to compare objects, we use .equals())
        // In Java, we use "==" only for primitives values (int, char, boolean, double, float etc.)
        if (password.equals("snow white")) {
            System.out.println("User has logged in successful");
        } else {
            System.out.println("Invalid password");
        }
    }
}
