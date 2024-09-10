package Topic07_Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

class DataReading {
    // Encapsulaton is only possible due to data hiding
    private ArrayList<Integer> readings = new ArrayList<>();
    private double mean;

    public DataReading() {

    }

    public void addReading(int newReading) {
        if (newReading < 0 || newReading % 2 == 0) {
            throw new IllegalArgumentException();
        }
        readings.add(newReading);
    }

    public double getMean() {

        return mean;
    }

    public void calculateMean() {
        int total = 0;
        for (int n : readings) {
            total += n;
        }
        mean = total / (readings.size() * 1.0);
    }
}

public class L02_Mean {
    public static void main(String[] args) {
        // Java will use type inference to set the data type of `reading`
        var reading = new DataReading();

        // Unencapsulated method of adding to the array list
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive number or -99 to quit: ");
            int number = sc.nextInt();
            if (number == -99) {
                break;
            }
            try {
                // we only want to accept positive numbers
                reading.addReading(number);
            } catch (Exception e) {
                System.out.println("Positive numbers only");
            }

        }
        reading.calculateMean();

        System.out.println(reading.getMean());
    }
}
