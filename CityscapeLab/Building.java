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
        
       Rectangle building1 = new Rectangle(xValue, yValue, 115 ,500);
       g2.draw(building1);
       
       Rectangle building2 = new Rectangle(xValue + 115, yValue - 150, 95, 1000);
       g2.draw(building2);
       
       Rectangle building3 = new Rectangle(xValue + 210, yValue - 500, 100, 5000);
       g2.draw(building3);
    }
}
        