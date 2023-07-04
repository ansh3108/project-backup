/* 
 The standard form of quadratic equation is given by: ax2 + bx + c = 0, where d = b2 - 4ac, is known as discriminant that determines the nature of the roots of the equation as:

Condition    Nature
if d >= 0    Roots are real
if d < 0    Roots are imaginary

Write a program to determine the nature and the roots of a quadratic equation, taking a, b, c as input. If d = b2 - 4ac is greater than or equal to zero, then display 'Roots are real', otherwise display 'Roots are imaginary'. The roots are determined by the formula as:
r1 = (-b + √(b2 - 4ac)) / 2a , r2 = (-b - √(b2 - 4ac)) / 2a
 */
import java.util.*;
public class Q_4
{
    public static void main(String args[]){ 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        
        System.out.print("Enter b: ");
        int b = in.nextInt();
        
        System.out.print("Enter c: ");
        int c = in.nextInt();
        
        double d = Math.pow(b, 2) - (4 * a * c);
        
        if (d >= 0) {
            System.out.println("Roots are real.");
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
        
            System.out.println("Roots of the equation are:");
            System.out.println("r1=" + r1 + ", r2=" + r2);
        }
        else {
            System.out.println("Roots are imaginary.");
        }
            
        
    }
}