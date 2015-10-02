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
         * Draws the building
         */
        
       Rectangle text = new Rectangle(xValue, yValue, 50,100);
    }
}
        