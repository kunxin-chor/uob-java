import java.util.Scanner;

public class L09WhileLoops {
    public static void main(String[] args) {
        // the while loop is like a if, except that
        // the code in the body will repeats until the condition is false
        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        // for loop 
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }

        // we want the user to type in 'y' or 'Y'
        // if the user doesn't, we keeping asking
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter y or Y: ");
        // String input = sc.nextLine();
        // while (input.toLowerCase().equals("y") == false ) {
        //     System.out.println("Enter y or Y: ");
        //     input = sc.nextLine();
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter y or Y: ");
        String input = sc.nextLine();
        while (! input.toLowerCase().equals("y")){
            System.out.print("Invalid input. Enter y or Y: ");
            input = sc.nextLine();
        }

    }
}
