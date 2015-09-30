import java.util.Scanner;
// example phone number ((for reference)): 6303053469

public class Pseudocode_1
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a phone number without parenthesis or hyphens ((aka dashes)): ");
        String number = s.next();
        
        String area_code = number.substring(0,3);
        String first_three = number.substring(3,6);
        String last_four = number.substring(7,10);
        
        System.out.printf("Your number with the proper format is: (" + area_code + ") - " + first_three + "- " + last_four);
    }
}
        