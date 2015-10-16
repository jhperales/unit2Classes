import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Sun
{
    private int xValue;
    private int yValue;
    
    /**
     * a sun that can be placed anywhere ((almost))
     */
    public Sun (int x, int y)
    {
        /**
         * default constructor
         * @param x and y are the coordinates in which sun is places
         */
        xValue = x;
        yValue = y;
    }
    
    public void draw(Graphics2D g2)
    {
        /**
         * draws the sun ((or suns))
         */
        
        Ellipse2D.Double sun = new Ellipse2D.Double(xValue, yValue, 50, 50);
        g2.draw(sun);
    }
}
