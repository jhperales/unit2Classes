import java.util.Scanner;

public class Rectange
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Length of rectangle: ");
        double length = s.nextDouble();
        
        System.out.print("Width of rectangle: ");
        double width = s.nextDouble();
        
        double perimeter = (2*length) + (2*width);
        double area = length*width;
        
        double diagonal_initial = (length*length) + (width*width);
        double diagonal_final = diagonal_initial*diagonal_initial;
        
        System.out.printf("Perimeter: %.2f \nArea: %.2f \nDiagonal: %.2f", perimeter, area, diagonal_final);
    }
}
