import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Alpit on 02-12-2016.
 */
public class Adapterdemo extends JFrame {

    public Adapterdemo(String s)  {
        super(s);

        adapter adap = new adapter(this);
        addWindowListener(adap);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
    graphics.drawString("This is frame window",10,40);
    }
}

class adapter extends WindowAdapter{
    Adapterdemo adapterdemo;

    public adapter(Adapterdemo adapterdemo) {
        this.adapterdemo = adapterdemo;
    }



    @Override
    public void windowClosing(WindowEvent windowEvent) {
       adapterdemo.setVisible(false);
    }
}

class applet extends Applet

{
  Frame f;
    @Override
    public void init() {
        super.init();
   f= new Adapterdemo("alpit is a");
        f.setVisible(true);
        f.setSize(250,250);
    }

    @Override
    public void start() {
        f.setVisible(true);

    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
    graphics.drawString("alpit is nyc guy.",10,20);
    }
}