package Quiz;
import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Print the requested prompt
        System.out.println("Enter three numbers:");
        
        // Read three numbers from the console
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
        // Check if all numbers are identical
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equals");
        } else {
            // Find the maximum value among the three
            double largest = num1;
            
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }
            
            // Print the largest number
            System.out.println("The largest number is " + largest);
        }
        
        // Close the scanner to release resources
        scanner.close();
    }
}