<<<<<<< HEAD


/**
 * Write a description of class Pseudocode_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pseudocode_2
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Pseudocode_2
     */
    public Pseudocode_2()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
=======
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
        
        if (recieved < due)
        {
            System.out.print("Invalid Payment");
        }
        
        else
        {
            double change = recieved - due;
            System.out.printf("The change is: %.2f", change);
            double dollar = change/1;
            int dollars = (int) dollar;
            change = change - dollars;
            
            double quarter = change/.25;
            int quarters = (int) quarter;
            change = change - (quarters * .25);
            
            double dime = change/.10;
            int dimes = (int) dime;
            change = change - (dimes * .10);
            
            double nickel = change/.05;
            int nickels = (int) nickel;
            change = change - (nickel * .05);
            
            double penny = change/.01;
            int pennies = (int) penny;
            change = change - (pennies * 100);
            
            
            System.out.print("\n\nYou should give the following:");
            System.out.print("\nDollars: " + dollars);
            System.out.print("\nQuarters: " + quarters);
            System.out.print("\nDimes: " + dimes);
            System.out.print("\nNickels: " + nickels);
            System.out.print("\nPennies: " + pennies);
        
        }
    }
}
>>>>>>> origin/master
