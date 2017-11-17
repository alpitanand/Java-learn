import javax.swing.*;
import java.awt.*;

/**
 * Created by Alpit on 30-11-2016.
 */
public class Banner extends JApplet implements Runnable {

    String msg ;
    Thread t=null;
   volatile boolean flag ;
    @Override
    public void init() {
        setBackground(Color.BLACK);
        setBackground(Color.GREEN);
        super.init();

    }

    @Override
    public void start() {
        super.start();
       msg=getParameter("message");
        if(msg==null)
        {
            msg="Message not found";
        }
        msg=" "+msg;
        t= new Thread(this);

        t.start();
    flag=false;
    }

    @Override
    public void run() {
        for( ;     ;  )
        {
           try{
               repaint();
               Thread.sleep(250);
               if(flag)
               {
                   break;
               }
           } catch (InterruptedException e) {
               System.out.println("applet closed");

           }
        }
    }

    @Override
    public void stop() {
        super.stop();
    flag=true;
        t=null;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
    char ch;
        ch=msg.charAt(0);
        msg= msg.substring(1,msg.length());
        msg = msg+ch;
        graphics.drawString(msg,50,30);
    }
}
