import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Background
{
    private int xValue;
    private int yValue;
    /**
     * a building that has can be placed anywhere
     */
    public Background (int x, int y, String time_of_day)
    {
        xValue = x;
        yValue = y;
        time = time_of_day;
    }
    
    public void draw(Graphics2D g2)
    {
        /**
         * Draws the background and fills it
         */
        
        Rectangle background = new Rectangle(xValue, yValue, 1000000, 10000000);
        
        if (time == "day")
        {
            
            g2.setColor(Color.cyan);
            g2.fill(background);
       
        }
        
        if (time == "night")
        {
            g2.setColor(Color.black);
            g2.fill(background);
        }
    }
}
        