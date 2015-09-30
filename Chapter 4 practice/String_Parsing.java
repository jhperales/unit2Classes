import java.util.Scanner;

public class String_Parsing
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter an integer number between ((and including)) 1,000 to 999,999 and inclued the comma when necessary: ");
        String number = s.next();
        
       
        number = number.replaceAll(",", "");
        System.out.print("The number without the comma: " + number);
    }
}