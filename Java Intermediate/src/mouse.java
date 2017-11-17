import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Alpit on 01-12-2016.
 */
public  class mouse extends JApplet implements MouseListener, MouseMotionListener {


    String msg= "Alpit is a great guy";
    int mouseX=0;
    int mouseY=0;

    @Override
    public void init() {
        super.init();
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override


    public void mouseClicked(MouseEvent mouseEvent) {
        mouseX=mouseEvent.getX();
        mouseY=mouseEvent.getY();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
System.out.print("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        mouseX=mouseEvent.getX();
        mouseY=mouseEvent.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
   graphics.drawString(msg,mouseX,mouseY);
    }
}
