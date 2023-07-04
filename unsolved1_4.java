import java.util.Scanner;

public class unsolved1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        double sum = 0.0;
        double factorial = 1.0;

        for (int i = 2; i <= 10; i++) {
            factorial *= i; // Calculate the factorial of the current iteration index
            double term = a / factorial; // Calculate the term for the current iteration
            if (i % 2 == 0) {
                sum += term; // Add the term if the current iteration index is even
            } else {
                sum -= term; // Subtract the term if the current iteration index is odd
            }
        }

        System.out.println("Sum of the series: " + sum);
    }
}
