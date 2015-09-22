import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Target
{
    private int xLeft;
    private int yTop;
    
    /**
     * a target that can be placed anywhere
     */
    public Target(int x, int y)
    {
        /**
         * Contructs a target with a given top left corner
         * @param x the x-cooridnate of the top left corner
         * @param y the y-coordinate of the top left corner
         */
        
        xLeft = x;
        yTop = y;
    }
    
    public void draw_black(Graphics2D g2, int diameter)
    {
        /**
         * draws the target
         * @param g2 the grahpics content
         */
        
        Ellipse2D black_circle = new Ellipse2D.Double(xLeft, yTop, diameter, diameter);
        g2.draw(black_circle);
        
        
    }
}