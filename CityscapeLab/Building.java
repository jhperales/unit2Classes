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
        
        //Buildings
       Rectangle building1 = new Rectangle(xValue - 30, yValue, 143, 800);
       g2.draw(building1);
       g2.setColor(Color.red);
       g2.fill(building1);
       
       Rectangle building2 = new Rectangle(xValue + 150, yValue - 100, 200, 850);
        g2.draw(building2);
        g2.setColor(Color.black);
        g2.fill(building2);
       
       Rectangle building3 = new Rectangle(xValue + 350, yValue, 400, 100);
       g2.draw(building3);
       
       Rectangle building4 = new Rectangle(xValue + 750, yValue - 100, 200, 850);
       g2.draw(building4);
       
       Rectangle building5 = new Rectangle(xValue + 1000 , yValue + 50, 500, 700); 
       g2.draw(building5);
       
       Rectangle building5_top = new Rectangle(xValue + 1070, yValue + 1, 100, 50);
       g2.draw(building5_top);
       
       //Windows for building 1
       Rectangle window1 = new Rectangle(xValue - 20, yValue + 5, 50, 50);
       g2.draw(window1);
       
       
       Rectangle window2 = new Rectangle(xValue + 50, yValue + 5, 50, 50);
       g2.draw(window2);
       
       
       Rectangle window3 = new Rectangle(xValue - 20, yValue + 65, 50, 50);
       g2.draw(window3);
       
       Rectangle window4 = new Rectangle(xValue + 50, yValue + 65, 50, 50);
       g2.draw(window4);
       
       Rectangle window5 = new Rectangle(xValue -20, yValue + 125, 50, 50);
       g2.draw(window5);
       
       Rectangle window6 = new Rectangle(xValue + 50, yValue + 125, 50, 50);
       g2.draw(window6);
       
       Rectangle window7 = new Rectangle(xValue - 20, yValue + 185, 50, 50);
       g2.draw(window7);
       
       Rectangle window8 = new Rectangle(xValue + 50, yValue + 185, 50, 50);
       g2.draw(window8);
       
       Rectangle window9 = new Rectangle(xValue - 20, yValue + 245, 50, 50);
       g2.draw(window9);
       
       Rectangle window10 = new Rectangle(xValue + 50, yValue + 245, 50, 50);
       g2.draw(window10);
       
       g2.setColor(Color.black);
       g2.fill(window1);
       g2.fill(window2);
       g2.fill(window3);
       g2.fill(window4);
       g2.fill(window5);
       g2.fill(window6);
       g2.fill(window7);
       g2.fill(window8);
       g2.fill(window9);
       g2.fill(window10);
       g2.setColor(Color.gray);
       
       //windows for building 2
       g2.setColor(Color.red);
       
       Rectangle window2_1 = new Rectangle(xValue + 160, yValue - 90, 100, 100);
       g2.draw(window2_1);
       
       Rectangle window2_2 = new Rectangle(xValue + 235, yValue + 20, 100, 100);
       g2.draw(window2_2);
       
       Rectangle window2_3 = new Rectangle(xValue + 160, yValue + 130, 100, 100);
       g2.draw(window2_3);
       
       Rectangle window2_4 = new Rectangle(xValue +235, yValue + 235, 100, 80);
       g2.draw(window2_4);
       
       g2.setColor(Color.red);
       g2.fill(window2_1);
       g2.fill(window2_2);
       g2.fill(window2_3);
       g2.fill(window2_4);
       
       
       //windows for building three
       
       
    }
}
        