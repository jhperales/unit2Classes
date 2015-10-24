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
        g2.setColor(Color.blue);
        g2.fill(building2);
       
       Rectangle building3 = new Rectangle(xValue + 350, yValue, 400, 100);
       g2.draw(building3);
       g2.draw(building2);
        g2.setColor(Color.black);
        g2.fill(building3);
       
       
       Rectangle building4 = new Rectangle(xValue + 750, yValue - 100, 200, 850);
       g2.draw(building4);
       g2.draw(building2);
        g2.setColor(Color.black);
        g2.fill(building4);
       
       
       Rectangle building5 = new Rectangle(xValue + 1000 , yValue + 50, 500, 700); 
       g2.draw(building5);
       g2.setColor(Color.gray);
       g2.fill(building5);
 
       Rectangle building5_top = new Rectangle(xValue + 1070, yValue + 1, 100, 50);
       g2.draw(building5_top);
       g2.fill(building5_top);
       
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
       
       g2.setColor(Color.yellow);
       g2.fill(window2_1);
       g2.fill(window2_2);
       g2.fill(window2_3);
       g2.fill(window2_4);
       
       
       //windows for building three
       Rectangle window3_1 = new Rectangle(xValue + 370, yValue + 9, 360, 75);
       g2.draw(window3_1);
       
       g2.setColor(Color.yellow);
       g2.fill(window3_1);
       
       //windows for building 4
       Rectangle window4_1 = new Rectangle(xValue + 765, yValue - 90, 100, 100);
       g2.draw(window4_1);
       
       Rectangle window4_2 = new Rectangle(xValue + 838, yValue + 20, 100, 100);
       g2.draw(window4_2);
       
       Rectangle window4_3 = new Rectangle(xValue + 765, yValue + 130, 100, 100);
       g2.draw(window4_3);
       
       Rectangle window4_4 = new Rectangle(xValue + 838, yValue + 235, 100, 80);
       g2.draw(window4_4);
       
        g2.setColor(Color.yellow);
       g2.fill(window4_1);
       g2.fill(window4_2);
       g2.fill(window4_3);
       g2.fill(window4_4);
       
       //windows for building five
       Rectangle window5_1 = new Rectangle(xValue + 1010, yValue + 60, 50, 50);
       g2.draw(window5_1);
       
       Rectangle window5_2 = new Rectangle(xValue + 1080, yValue + 60, 50, 50);
       g2.draw(window5_2);
       
       Rectangle window5_3 = new Rectangle(xValue + 1150, yValue + 60, 50, 50);
       g2.draw(window5_3);
       
       Rectangle window5_4 = new Rectangle(xValue + 1220, yValue + 60, 50, 50);
       g2.draw(window5_4);
       
       Rectangle window5_5 = new Rectangle(xValue + 1290, yValue + 60, 50, 50);
       g2.draw(window5_5);
       
       Rectangle window5_6 = new Rectangle(xValue + 1010, yValue + 120, 50, 50);
       g2.draw(window5_6);
       
       Rectangle window5_7 = new Rectangle(xValue + 1080, yValue + 120, 50, 50);
       g2.draw(window5_7);
       
       Rectangle window5_8 = new Rectangle(xValue + 1150, yValue + 120, 50, 50);
       g2.draw(window5_8);
       
       Rectangle window5_9 = new Rectangle(xValue + 1220, yValue + 120, 50, 50);
       g2.draw(window5_9);
       
       Rectangle window5_10 = new Rectangle(xValue + 1290, yValue + 120, 50, 50);
       g2.draw(window5_10);
       
       Rectangle window5_11 = new Rectangle(xValue + 1010, yValue + 180, 50, 50);
       g2.draw(window5_11);
       
       Rectangle window5_12 = new Rectangle(xValue + 1080, yValue + 180, 50, 50);
       g2.draw(window5_12);
       
       Rectangle window5_13 = new Rectangle(xValue + 1150, yValue + 180, 50, 50);
       g2.draw(window5_13);
       
       Rectangle window5_14 = new Rectangle(xValue + 1220, yValue + 180, 50, 50);
       g2.draw(window5_14);
       
       Rectangle window5_15 = new Rectangle(xValue + 1290, yValue + 180, 50, 50);
       g2.draw(window5_15);
       
       Rectangle window5_16 = new Rectangle(xValue + 1010, yValue + 240, 50, 50);
       g2.draw(window5_16);
       
       Rectangle window5_17 = new Rectangle(xValue + 1080, yValue + 240, 50, 50);
       g2.draw(window5_17);
       
       Rectangle window5_18 = new Rectangle(xValue + 1150, yValue + 240, 50, 50);
       g2.draw(window5_18);
       
       Rectangle window5_19 = new Rectangle(xValue + 1220, yValue + 240, 50, 50);
       g2.draw(window5_19);
       
       Rectangle window5_20 = new Rectangle(xValue + 1290, yValue + 240, 50, 50);
       g2.draw(window5_20);
       
       
      g2.setColor(Color.orange);
      g2.fill(window5_1);
      g2.fill(window5_2);
      g2.fill(window5_3);
      g2.fill(window5_4);
      g2.fill(window5_5);
      g2.fill(window5_6);
      g2.fill(window5_7);
      g2.fill(window5_8);
      g2.fill(window5_9);
      g2.fill(window5_10);
      g2.fill(window5_11);
      g2.fill(window5_12);
      g2.fill(window5_13);
      g2.fill(window5_14);
      g2.fill(window5_15);
      g2.fill(window5_16);
      g2.fill(window5_17);
      g2.fill(window5_18);
      g2.fill(window5_19);
      g2.fill(window5_20);
      
    }
}
        