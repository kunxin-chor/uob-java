import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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

        // Map (is known as key/value pair - dictionary (Python) and objects (JavaScript))
        // we have to define the data type of the key and the value
        Map<String, Integer> months = new HashMap<String,Integer>(); // the key is String and the values are integers
        months.put("Jan", 31);  // months["Jan"] = 31 (Python syntax)
        months.put("Feb", 28); // months["Feb"] = 28;
        months.put("Mar", 30); // months["Mar"] = 30;
        
        System.out.println(months.get("Jan"));
        System.out.println("There are " + months.get("Feb") + " days in Feburary");

        // When using generic collections, the data type in <> must be
        // the class-eqv. of the primitive data type if we want the collection
        // to store a primitive data type
        // ArrayList<int> primeNumbers = new ArrayList<int> // <-- WON'T WORK
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        ArrayList<Double> ratios = new ArrayList<Double>();
        ArrayList<Boolean> switches = new ArrayList<Boolean>();

    }
}
