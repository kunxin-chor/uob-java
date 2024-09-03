public class L05Methods {

    // the main method is starting point of all Java programs
    // it is automatically by Java when you run a Java program
    // (don't name any of your own methods as `main`)

    public static void main(String args[]) {
        int foobar = addTwoNumber(3, 4);
        System.out.println(foobar);
    }

    // method that takes two integers as parameters
    // and return their sum
    public static int addTwoNumber(int x, int y) {
        int sum = x + y;
        return sum; // the result of addTwoNumber is the sum of x and y
    }

    // define a method named calculateGST
    // takes in two parameters, the amount to pay, and the gst percentage (decimal)
    public static double calculateGST(double amount, double gstPercentage) {
        return amount * gstPercentage;
    }

    // define a method named calculatePerimeter
    // what will be the parameters, and what will be the return data type
    // and how do you calculate the perimeter
    public static int calculatePerimeter(int length, int width) {
        return (2*length) + (2*width);
        // if length  is 10 and width is 5:
        // return 2 * length + 2 * width;
        // => return 20 + 10
        // => return 30
        
    }

    // if you method doesn't return a value, the data tye is void (aka no data type)
    public static void sayHello() {
        System.out.println("Hello world");
    }

}

