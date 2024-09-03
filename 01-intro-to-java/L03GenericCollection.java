import java.util.ArrayList;

public class L03GenericCollection {
    public static void main(String[] args) {
        // make sure to have an `import java.util.ArrayList` at 
        // the top of your file
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // ArrayList has no maximum size
        // it functions like the list in Python and array in JavaScript
        numbers.add(42);
        numbers.add(33);
        numbers.add(55);

        // to acccess elements in an array list, we use the `get` method
        System.out.println(numbers.get(2));  // do not use [] to access elements in an ArrayList

        // shortcut to creating a new arraylist
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Peter");
        names.add("Paul");

        System.out.println(names);


    }
}
