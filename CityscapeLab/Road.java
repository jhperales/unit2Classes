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
        
        Rectangle road = new Rectangle(xValue, yValue + 770, 10000, 150);
        g2.draw(road);
       
        Rectangle curb = new Rectangle(xValue, yValue + 770, 10000, 25);
        g2.draw(curb);
        g2.setColor(Color.WHITE);
        g2.fill(curb);
    }
}
        