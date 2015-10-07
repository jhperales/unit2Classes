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
         * Draws theroad
         */
        
        Rectangle road = new Rectangle(xValue, yValue + 800, 10000, 100);
        g2.draw(road);
       
       
       
    }
}
        