/*Question 6
An ICSE school displays a notice on the school notice board regarding admission in Class XI for choosing stream according to marks obtained in English, Maths and Science in Class 10 Council Examination.

Marks obtained in different subjects	Stream
Eng, Maths and Science >= 80%	Pure Science
Eng and Science >= 80%, Maths >= 60%	Bio. Science
Eng, Maths and Science >= 60%	Commerce
Print the appropriate stream allotted to a candidate. Write a program to accept marks in English, Maths and Science from the console.
*/

import java.util.Scanner;

public class Q_6
{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter marks in English: ");
        int eng = in.nextInt();
        
        System.out.print("Enter marks in Maths: ");
        int maths = in.nextInt();
        
        System.out.print("Enter marks in Science: ");
        int sci = in.nextInt();
        
        if (eng >= 80 && sci >= 80 && maths >= 80) 
            System.out.println("Pure Science");
        else if (eng >= 80 && sci >= 80 && maths >= 60)
            System.out.println("Bio. Science");
        else if (eng >= 60 && sci >= 60 && maths >= 60)
            System.out.println("Commerce");
        else
            System.out.println("Cannot allot stream");
    }
}