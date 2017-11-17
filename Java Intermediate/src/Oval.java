import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Alpit on 03-12-2016.
 */
public class Oval extends Frame {
    int a = 30;
    int b = 40;
    int c = 50;
    int d = 20;

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillOval(a, b, c, d);
    }

    public Oval() {
        addMouseListener(new Mousee(this));
    }

    public static void main(String args[]) {
        Oval o = new Oval();
        o.setTitle("oval");
        o.setSize(200, 250);
    o.setVisible(true);
    }

    /**
     * Created by Alpit on 03-12-2016.
     */
    public static class Mousee extends MouseAdapter {
        Oval oval;
        public Mousee(Oval oval) {
        this.oval=oval;
        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

            oval.c=oval.c+10;
            oval.d=oval.d+10;
        oval.repaint();
        }

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            super.mouseClicked(mouseEvent);
            oval.a=mouseEvent.getX();
            oval.b=mouseEvent.getY();
     oval.repaint();
        }

    }
}

