import javax.swing.JFrame;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author Jerome
 * @version 1 October 2015
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 60;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(1366 /* x */, 755 /* y */);
        frame.setTitle("Cityscape");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // ...
        
        
        
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent( /* pass the user-specified value */ );
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 5000 );
        }
        
    }

}
