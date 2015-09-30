import java.util.Scanner;

public class Pseudocode_2
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Amount Due: ");
        double due = s.nextDouble();
        
        System.out.print("Amount Recieved from Customer: ");
        double recieved = s.nextDouble();
        
        double change = recieved - due;
        System.out.printf("The change is: %.2f", change);
    }
}