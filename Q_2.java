/* A triangle is said to be an 'Equable Triangle', if the area of the triangle is equal to its perimeter. 
 Write a program to enter three sides of a triangle. Check and print whether the triangle is equable or not.
For example, a right angled triangle with sides 5, 12 and 13 has its area and perimeter both equal to 30.
 */
import java.util.*;
public class Q_2 {
    public static void main(String args[]){ 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first side (perpendicular):");
        int side1 = in.nextInt();
        System.out.println("Enter the second side (base):");
        int side2 = in.nextInt();
        System.out.println("Enter the third side (hypotenuse):");
        int side3 = in.nextInt();
        
        double area = 0.5 * side1 * side2;
        double perimeter = side1 + side2 + side3;
        
        if(area == perimeter){
            System.out.println("It is an equable triangle");
        } else {
            System.out.println("Not an equable triangle");
        }
    }
}