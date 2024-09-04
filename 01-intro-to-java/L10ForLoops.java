import java.util.ArrayList;

public class L10ForLoops {
    public static void main(String[] args) {
        // list out the elements in an array
        int[] numbers = {11, 22, 33};

        // old method of iterate through array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // new method of iterating through of an array
        for (int n : numbers) {
            System.out.println(n);
        }

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apples");
        fruits.add("Bananas");
        fruits.add("Cherries");
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}
