import java.util.Scanner;

public class unsolved1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double sum = a;
        double term = a;
        double factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
            term = a / factorial;
            if (i % 2 == 0) {
                sum -= term;
            } else {
                sum += term;
            }
        }

        System.out.println("Sum of the series up to the " + n + "th term: " + sum);
    }
}
