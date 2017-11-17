import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Created by Alpit on 02-12-2016.
 */
public class Windowed extends Frame {
    String msg =" ";
    int mouseX=0;
    int mouseY=0;

    public Windowed() {

        addMouseListener(new MouseAdapte(this));
        addWindowListener(new Windwadapter(this));
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
    graphics.drawString("Alpit is a nice guy",10,40);
    graphics.drawString(msg,mouseX,mouseY);
    }

    public static void main(String args[])
    {
        Windowed win = new Windowed();
        win.setSize(200,250);
        win.setVisible(true);
        win.setTitle("Alpit");
    }

    /**
     * Created by Alpit on 02-12-2016.
     */
    public static class Windwadapter extends WindowAdapter {
        Windowed windowed;
        public Windwadapter(Windowed windowed) {
        this.windowed=windowed;
        }

        @Override
        public void windowClosing(WindowEvent windowEvent) {
            super.windowClosing(windowEvent);
        System.exit(0);
        }
    }

    /**
     * Created by Alpit on 02-12-2016.
     */
    public static class MouseAdapte extends MouseAdapter {
        Windowed windowed;
        public MouseAdapte(Windowed windowed) {
        this.windowed=windowed;
        }

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            super.mouseClicked(mouseEvent);
            windowed.mouseX=mouseEvent.getX();
            windowed.mouseY=mouseEvent.getY();
            windowed.msg="Mouse at"+windowed.mouseX+ " "+windowed.mouseY;
        windowed.repaint();
        }
    }
}
