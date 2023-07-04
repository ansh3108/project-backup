/* Question 5:
An air-conditioned bus charges fare from the passengers based on the distance travelled as per the tariff given below:

Distance Travelled	Fare
Up to 10 km	Fixed charge ₹80
11 km to 20 km	₹6/km
21 km to 30 km	₹5/km
31 km and above	₹4/km
Design a program to input distance travelled by the passenger. Calculate and display the fare to be paid.
*/
import java.util.Scanner;

public class Q_5
{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter distance travelled: ");
        int dist = in.nextInt();
        
        int fare = 0;
        
        if (dist <= 0)
            fare = 0;
        else if (dist <= 10)
            fare = 80;
        else if (dist <= 20)
            fare = 80 + (dist - 10) * 6;
        else if (dist <= 30)
            fare = 80 + 60 + (dist - 20) * 5;
        else if (dist > 30)
            fare = 80 + 60 + 50 + (dist - 30) * 4;
            
        System.out.println("Fare = " + fare);
    }
}