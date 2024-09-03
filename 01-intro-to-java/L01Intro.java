public class L01Intro {
    // the main method is the entry point of
    // all Java programs
    public static void main(String[] args) {
        System.out.println("Hello World");

        // what are data types that a programming langauge support?
        // is the langauge loosely-type or strongly-typed? (Java is the latter)
        // when we define a variable, we must specify its data type and that cannot be changed
        int secretOfLife = 42;  // +2 billion to -2 billion
        // secretOfLife = "forty two"; // illegal! secretOfLife can only store integers
        short moneyInBalance = 3200;   

        // decimal numbers
        double gstPercentage = 0.07;
        float f = 1.0f;  // floating point values (aka float) have a `f` at the back

        // Strings (must be defined with double quotes)
        // String are objects in JavaScript
        String sentence = "She sells seashell at the seashore";
        String word = "hello";

        // char
        // is represent one character
        char alpha = 'A';  

        // boolean - true/false
        boolean isRaining = false;

        System.out.println("Secret of Life =" + secretOfLife);
        System.out.println(isRaining);


  
    }
}