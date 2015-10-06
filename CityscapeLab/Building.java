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
        
       Rectangle building1 = new Rectangle(xValue, yValue, 150, 800);
       g2.draw(building1);
       
       Rectangle post_office = new Rectangle(xValue + 100, yValue + 200 , 300, 900);
       g2.draw(post_office); 
       
       
    }
}
        