/*
Question 8
A courier company charges differently for 'Ordinary' booking and 'Express' booking based on the weight of the parcel as per the tariff given below:

Weight of parcel	Ordinary booking	Express booking
Up to 100 gm	₹80	₹100
101 to 500 gm	₹150	₹200
501 gm to 1000 gm	₹210	₹250
More than 1000 gm	₹250	₹300
Write a program to input weight of a parcel and type of booking (`O' for ordinary and 'E' for express). Calculate and print the charges accordingly.
*/
import java.util.Scanner;

public class Q_8
{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter weight of parcel: ");
        double wt = in.nextDouble();
        
        System.out.print("Enter type of booking: ");
        char type = in.next().charAt(0);
        
        double charge = 0;
        
        if (wt <= 0)
            charge = 0;
        else if (wt <= 100 && type == 'O')
            charge = 80;
        else if (wt <= 100 && type == 'E')
            charge = 100;
        else if (wt <= 500 && type == 'O')
            charge = 150;
        else if (wt <= 500 && type == 'E')
            charge = 200;
        else if (wt <= 1000 && type == 'O')
            charge = 210;
        else if (wt <= 1000 && type == 'E')
            charge = 250;
        else if (wt > 1000 && type == 'O')
            charge = 250;
        else if (wt > 1000 && type == 'E')
            charge = 300;
            
        System.out.println("Parcel charges = " + charge);
    }
}