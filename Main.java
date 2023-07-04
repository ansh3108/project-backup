import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        
        int counter = 0;
        counter += X;
        counter -= Y;
        
        System.out.println(counter);
    }
}
