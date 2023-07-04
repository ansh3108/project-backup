/*
A special two-digit number is such that when the sum of its digits is added to the product of its digits, the result 
is equal to the original two-digit number.
Example: Consider the number 59.
Sum of digits = 5 + 9 = 14
Product of digits = 5 * 9 = 45
Total of the sum of digits and product of digits = 14 + 45 = 59
Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits. If the value
is equal to the number input, display the message "Special 2 - digit number" otherwise, display the message "Not a
special two-digit number".
 */
import java.util.*;
public class Q_3
{
   public static void main(String args[]){ 
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number :");
       int num = in.nextInt();
       if(num<10 || num>99){
        System.out.println("Enter a vaid 2-digit number");
    }
    int clone = num;
    int num1 = clone%10;
    int num2 = clone/10;
    clone/=10;
    int sum = num1+num2;
    int mult = num1*num2;
    int totalsum = sum+mult;
    
    if(totalsum == num){
        System.out.println("Special 2-digit number");
        
    }
    else{
        System.out.println("Not a special 2-digit number");
    }
    //UwU
}
}