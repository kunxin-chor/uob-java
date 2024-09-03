public class L02Array {
    public static void main(String[] args) {
        // define an integer array named 'numbers' that can store three values
        // 1. arrays can store a finite amount of value (aka elements)
        // 2. it can store only one data type
        int[] numbers = new int[3];
        // 3. indexes in arrays are 0-based
        numbers[0] = 11;
        numbers[1] = 13;
        numbers[2] = 17;

        System.out.println(numbers[1]);

        // define an array that contains three strings
        String[] superheroes = {"Ironman", "Spiderman", "Antman"};
    }

}
