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
    private String time_of_day;
    /**
     * a building that has can be placed anywhere
     */
    public Background (int x, int y, String time)
    {
        xValue = x;
        yValue = y;
        time_of_day = time;
    }
    
    public void draw(Graphics2D g2)
    {
        /**
         * Draws the background and fills it
         */
        
        Rectangle background = new Rectangle(xValue, yValue, 1000000, 10000000);
        g2.draw(background);
        
        if (time_of_day.equals("day"))
        {
            g2.setColor(Color.cyan);
            g2.fill(background);
        }
        
        if (time_of_day.equals("night"))
        {
            g2.setColor(Color.black);
            g2.fill(background);
        }
    }
}
        