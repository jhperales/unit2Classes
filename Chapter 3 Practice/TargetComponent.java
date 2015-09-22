import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target1 = new Target();
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        Target target2 = new Target(x ,y);
        
        target1.draw(g2);
        target2.draw(g2);
    }
}
        