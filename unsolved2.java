import java.util.Scanner;

public class unsolved2
{
    public void twinPrimeCheck() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        boolean isAPrime = true;

        for (int i = 2; i <= a / 2; i++) {

            if (a % i == 0) {
                isAPrime = false;
                break;
            }

        }

        if (isAPrime && Math.abs(a - b) == 2) {
            
            boolean isBPrime = true;
            
            for (int i = 2; i <= b / 2; i++) {

                if (b % i == 0) {
                    isBPrime = false;
                    break;
                }
                
            }
            
            if (isBPrime)
                System.out.println(a + " and " + b + " are twin prime");
            else
                System.out.println(a + " and " + b + " are not twin prime");
        }
        else
            System.out.println(a + " and " + b + " are not twin prime");
    }
}