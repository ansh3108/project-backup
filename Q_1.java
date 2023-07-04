/* Question 1 : Write a program to input three number's (positive or negative). If they are unequal then display the greatest
 number otherwise, display they are equal. The program also displays whether the numbers entered by the user are 'All positive'
 , 'All negative' or 'Mixed numbers'.
 Sample input : 56, -15, 12
 Sample output : The Greatest number is 56
 Entered numbers are mixed numbers
*/
import java.util.*;
public class Q_1
{
  public static void main(String args[]){ 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the first number:");
      int a = in.nextInt();
      System.out.println("Enter the second number:");
      int b = in.nextInt();
      System.out.println("Enter the third number:");
      int c = in.nextInt();
      if(a%2==0 && b%2==0 && c%2==0){
          System.out.println("All numbers are positive");
      }
      else if(a%2!=0 && b%2!=0 && c%2!=0){
                    System.out.println("All numbers are negative");
      }
      else{
                    System.out.println("All numbers are mixed");
      }
      if(a==b && b == c && c==a){
          System.out.println("All numbers are equal");
      }
      else{
      int greatest = a;
      if(greatest<b){
      greatest = b;          
      }
      if(greatest<c){
          greatest = c;
      }
      System.out.println("Greatest number = "+greatest);
    }
    }
}