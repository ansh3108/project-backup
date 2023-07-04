/*
Question 9
Write a program to input a number and check whether it is a perfect square or not. If the number is not a perfect square then find the least number to be added to input number, so that the resulting number is a perfect square.
Example 1:
Sample Input: 2025
                     √2025 = 45
Sample Output: It is a perfect square.
Example 2:
Sample Input: 1950
                     √1950 = 44.1588........
Least number to be added = 452 - 1950 = 2025 - 1950 = 75
*/

import java.util.*;

public class Q_9
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        
        if(num < 0) {
            System.out.println("Cannot calculate square root of negative number.");
            System.exit(0);
        }
        else 
        {
            double sqRoot = Math.sqrt(num);
            double sqRoot1 = Math.floor(sqRoot);
            double diff = sqRoot - sqRoot1;
            if (diff == 0) {
                System.out.println(num + " is a perfect square.");
            }
            else {
                 sqRoot1 += 1;
                 double temp = Math.pow(sqRoot1,2);
                 diff = temp - num;
                 System.out.println(num + " is not a perfect square.");
                 System.out.println("Least number to be added = " + diff); 
            }
        }
    }
}