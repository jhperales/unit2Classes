import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Road
{
    private int xValue;
    private int yValue;
    /**
     * a road that has can be placed anywhere
     */
    public Road (int x, int y)
    {
        xValue = x;
        yValue = y;
    }
    
    public void draw(Graphics2D g2)
    {
        /**
         * Draws the road and various markings
         */
        
        Rectangle road = new Rectangle(xValue, yValue + 477, 10000, 150);
        g2.draw(road);
        g2.setColor(Color.BLACK);
        g2.fill(road);
       
        Rectangle curb = new Rectangle(xValue, yValue + 477, 10000, 25);
        g2.draw(curb);
        g2.setColor(Color.GRAY);
        g2.fill(curb);
        
        Rectangle markings = new Rectangle(xValue, yValue + 800, 25, 15);
        
        
    }
}
        