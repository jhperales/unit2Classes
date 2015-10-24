import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Jerome
 * @version 1 October 2015
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    private Background background;
    private Building building;
    private Sun sun;
    private Road road;
     
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(String time)
    {
        this.background = new Background(0,0,time);
        this.building = new Building(50, 250);
        this.sun = new Sun(50, 50);
        this.road = new Road(0, 100);
    }
   
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        background.draw(g2);
        building.draw(g2);
        sun.draw(g2);
        road.draw(g2);
        
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        //update the objects in the cityscape so they are animated
        //...
              
       sun.move();
                
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
