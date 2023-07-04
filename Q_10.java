/*
Question 10
Write a program that accepts three numbers from the user and displays them either in "Increasing Order" or in "Decreasing Order" as per the user's choice.
Choice 1: Ascending order
Choice 2: Descending order

Sample Inputs: 394, 475, 296
Choice 2
Sample Output
First number : 475
Second number: 394
Third number : 296
The numbers are in decreasing order.
*/
import java.util.*;

public class Q_10
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();
        int max = 0, mid = 0, min = 0; 
        
        System.out.println("Choice 1: Ascending Order");
        System.out.println("Choice 2: Descending Order");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();
        
        if(ch != 1 && ch != 2)  {
            System.out.println("Wrong choice.");
        }
        else {
            if(a>b && a>c)  {
                max = a;
                if(b>c) {
                    mid = b;
                    min = c;
                }
                else {
                    mid = c;
                    min = b;
                }
            }
            if(b>a && b>c)  {
                max = b;
                if(a>c) {
                    mid = a;
                    min = c;
                }
                else {
                    mid = c;
                    min = a;
                }
            }
            if(c>a && c>b)  {
                max = c;
                if(a>b) {
                    mid = a;
                    min = b;
                }
                else {
                    mid = b;
                    min = a;
                }
            }
            
        }
        if(ch == 1) {
            System.out.println("First number: " + min);
            System.out.println("Second number: " + mid);
            System.out.println("Third number: " + max);
            System.out.println("The numbers are in increasing order");
        }
        else    {
            System.out.println("First number: " + max);
            System.out.println("Second number: " + mid);
            System.out.println("Third number: " + min);
            System.out.println("The numbers are in decreasing order");
        }
            
    }
}