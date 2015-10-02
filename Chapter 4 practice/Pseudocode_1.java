import java.util.Scanner;

public class Pseudocode_1
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("enter a phone number without parenthesis or hyphens ((aka dashes)): ");
        String number = s.next();
        
        String area = number.substring(0,3);
        String first = number.substring(3,6);
        String last = number.substring(6,10);
        
        System.out.print("Your phone number with the proper format is: (" + area + ") - " + first + "- " + last);
    }
}
        