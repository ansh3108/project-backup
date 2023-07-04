import java.util.Scanner;

public class unsolved1_2
{
    public void computeSum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        double sum = 0;
        
        for (int i = 1; i <= n; i++) {
            double f = 1;
            for (int j = 1; j <= i; j++) {
                f *= j;
            }
            sum += a / f;
        }
        System.out.println("Sum=" + sum);
        
    }
}