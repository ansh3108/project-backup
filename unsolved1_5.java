import java.util.Scanner;

public class unsolved1_5
{
    public void computeSum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        double sum = 0;
        int lastPrime = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = lastPrime + 1; j <= Integer.MAX_VALUE; j++) {
                boolean isPrime = true;
                for (int k = 2; k <= j / 2; k++) {
                    if (j % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if (isPrime) {
                    sum += j / Math.pow(a, i);
                    lastPrime = j;
                    break;
                }
            }

        }
        System.out.println("Sum=" + sum);
    }
}