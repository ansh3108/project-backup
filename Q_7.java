/*Question 7
A bank announces new rates for Term Deposit Schemes for their customers and Senior Citizens as given below:

Term	Rate of Interest (General)	Rate of Interest (Senior Citizen)
Up to 1 year	7.5%	8.0%
Up to 2 years	8.5%	9.0%
Up to 3 years	9.5%	10.0%
More than 3 years	10.0%	11.0%
The 'senior citizen' rates are applicable to the customers whose age is 60 years or more. Write a program to accept the sum (p) in term deposit scheme, age of the customer and the term. The program displays the information in the following format:

Amount Deposited	Term	Age	Interest earned	Amount Paid
xxx	xxx	xxx	xxx	xxx

*/

import java.util.Scanner;

public class Q_7
{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter sum: ");
        double sum = in.nextDouble();
        
        System.out.print("Enter age: ");
        int age = in.nextInt();
        
        System.out.print("Enter term: ");
        double term = in.nextDouble();
        
        double si = 0.0;
        
        if (term <= 1 && age < 60)
            si = (sum * 7.5 * term) / 100;
        else if (term <= 1 && age >= 60)
            si = (sum * 8.0 * term) / 100;
        else if (term <= 2 && age < 60)
            si = (sum * 8.5 * term) / 100;
        else if (term <= 2 && age >= 60)
            si = (sum * 9.0 * term) / 100;
        else if (term <= 3 && age < 60)
            si = (sum * 9.5 * term) / 100;
        else if (term <= 3 && age >= 60)
            si = (sum * 10.0 * term) / 100;
        else if (term > 3 && age < 60)
            si = (sum * 10.0 * term) / 100;
        else if (term > 3 && age >= 60)
            si = (sum * 11.0 * term) / 100;
            
        double amt = sum + si;
        
        System.out.println("Amount Deposited: " +  sum);
        System.out.println("Term: " +  term);
        System.out.println("Age: " +  age);
        System.out.println("Interest Earned: " +  si);
        System.out.println("Amount Paid: " +  amt);
    }
}