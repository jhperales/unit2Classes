import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Building
{
    private int xValue;
    private int yValue;
    /**
     * a building that has can be placed anywhere
     */
    public Building (int x, int y)
    {
        xValue = x;
        yValue = y;
    }
    
    public void draw(Graphics2D g2)
    {
        /**
         * Draws the building(s)
         * 0
         */
        
        //Buildings
       Rectangle building1 = new Rectangle(xValue - 30, yValue, 143, 800);
       g2.draw(building1);
       
       Rectangle building2 = new Rectangle(xValue + 150, yValue - 100, 200, 850);
       g2.draw(building2);
       
       Rectangle building3 = new Rectangle(xValue + 350, yValue, 400, 100);
       g2.draw(building3);
       
       Rectangle building4 = new Rectangle(xValue + 750, yValue - 100, 200, 850);
       g2.draw(building4);
       
       Rectangle building5 = new Rectangle(xValue + 1000 , yValue + 50, 500, 700); 
       g2.draw(building5);
       
       Rectangle building5_top = new Rectangle(xValue + 1070, yValue + 1, 100, 50);
       g2.draw(building5_top);
       
       //Windows
       Rectangle window1 = new Rectangle(xValue - 20, yValue + 5, 50, 50);
       g2.draw(window1);
       
       Rectangle window2 = new Rectangle(xValue + 50, yValue + 5, 50, 50);
       g2.draw(window2);
       
       Rectangle window3 = new Rectangle(xValue - 20, yValue + 65, 50, 50);
       g2.draw(window3);
       
       Rectangle window4 = new Rectangle(xValue + 50, yValue + 65, 50, 50);
       g2.draw(window4);
    }
}
        