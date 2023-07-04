import java.util.Scanner;

public class solved1_1
{
    public void computeSum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        double sum = 0.0;
        for (int i = 1, j = 1; i <= n; i++, j = j + 2) {
            double f = 1;
            for (int k = 1; k <= i; k++) {
                f *= k;
            }
            sum += j / f;
        }
        System.out.println("Sum=" + sum);
    }
}