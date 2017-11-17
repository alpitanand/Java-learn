import javax.swing.*;
import java.awt.*;

/**
 * Created by Alpit on 30-11-2016.
 */
public class passingparams extends JApplet {
    String fontname;

    @Override
    public void start() {
        super.start();
    String param;
        fontname=getParameter("fontname");
    if(fontname==null)
    {
        fontname="Not found";
    }
    }
public void paint(Graphics g)
{
    super.paint(g);
    g.drawString("Font name  :"+fontname,0,10);
}
}
