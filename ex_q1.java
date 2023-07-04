/** write a program to input three different single digit numbers between 1 and 9 (both inclusive). display the greatest 
 and smallest number 

sample input: 2,7,4
sample output:
greatest three digit number =742
smallest three digit number =247 */



import java.util.Scanner;

public class ex_q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input three single-digit numbers between 1 and 9
        System.out.print("Enter the first single-digit number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second single-digit number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third single-digit number: ");
        int num3 = input.nextInt();

        // Find the greatest and smallest three-digit numbers formed from the digits
        int greatest = Math.max(num1, Math.max(num2, num3));
        int smallest = Math.min(num1, Math.min(num2, num3));
        int middle = num1 + num2 + num3 - greatest - smallest;

        // Display the greatest and smallest three-digit numbers
        System.out.println("Greatest three-digit number = " + greatest + "" + middle + "" + smallest);
        System.out.println("Smallest three-digit number = " + smallest + "" + middle + "" + greatest);
    }
}
