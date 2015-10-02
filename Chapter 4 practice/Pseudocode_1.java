import java.util.Scanner;
<<<<<<< HEAD
=======
// example phone number ((for reference)): 6303053469
>>>>>>> origin/master

public class Pseudocode_1
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        
<<<<<<< HEAD
        System.out.print("enter a phone number without parenthesis or hyphens ((aka dashes)): ");
        String number = s.next();
        
        String area = number.substring(0,3);
        String first = number.substring(3,6);
        String last = number.substring(6,10);
        
        System.out.print("Your phone number with the proper format is: (" + area + ") - " + first + "- " + last);
=======
        System.out.print("Enter a phone number without parenthesis or hyphens ((aka dashes)): ");
        String number = s.next();
        
        String area_code = number.substring(0,3);
        String first_three = number.substring(3,6);
        String last_four = number.substring(7,10);
        
        System.out.printf("Your number with the proper format is: (" + area_code + ") - " + first_three + "- " + last_four);
>>>>>>> origin/master
    }
}
        