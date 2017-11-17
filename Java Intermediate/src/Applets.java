import javax.print.DocFlavor;
import javax.swing.*;
import java.applet.AudioClip;
import java.awt.*;

/**
 * Created by Alpit on 30-11-2016.
 */
public class Applets extends JApplet{

    @Override
    public void init() {
        super.init();
   setBackground(Color.BLACK);
    setForeground(Color.GREEN);
    }

    public void paint(Graphics g)
{
super.paint(g);
    g.drawString("Wow it wrorks",200,200);

}


}
