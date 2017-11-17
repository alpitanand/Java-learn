import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.function.DoubleUnaryOperator;

/**
 * Created by Alpit on 30-11-2016.
 */
public class Applet1 extends JApplet {

private double sum;
    @Override
    public void init() {
        super.init();
        String fn= JOptionPane.showInputDialog("ENter first no");
        String sn= JOptionPane.showInputDialog("ENter second no");
         double d= Double.parseDouble(fn);
        double d1= Double.parseDouble(sn);
          sum = d+d1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
   g.drawString("Sum is "+sum,  25,25);
    }
}
