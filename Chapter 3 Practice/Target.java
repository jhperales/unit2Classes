import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xValue;
    private int yValue;
    /**
     * a target that can be placed anywhere
     */
    public Target(int x, int y)
    {
        xValue = x;
        yValue = y;
    }
    
    public void draw(Graphics2D g2)
    {
        /**
         * draws the target
         * @param g2 the grahpics content
         */
        
        Ellipse2D.Double white1 = new Ellipse2D.Double(xValue + 15, yValue + 15, 150, 150);
        g2.draw(white1);
        g2.setColor(Color.WHITE);
        g2.fill(white1);
        
        Ellipse2D.Double white2 = new Ellipse2D.Double(xValue + 27.5, yValue + 27.5, 125, 125);
        g2.draw(white2);
        g2.setColor(Color.RED);
        g2.fill(white2);
        
        
        Ellipse2D.Double black1 = new Ellipse2D.Double(xValue + 40, yValue + 40, 100, 100);
        g2.draw(black1);
        g2.setColor(Color.BLACK);
        g2.fill(black1);
        
        Ellipse2D.Double black2 = new Ellipse2D.Double(xValue + 52.5, yValue + 52.5, 75, 75);
        g2.draw(black2);
        g2.setColor(Color.BLUE);
        g2.fill(black2);
    }
    
    
}