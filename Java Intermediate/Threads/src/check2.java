import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Alpit on 18-05-2017.
 */
public class check2 extends Thread {
    ArrayList<Integer> ab= new ArrayList<>();
    @Override
    public void run() {
        super.run();
        for(int i=0;i<5;i++)
        {
            ab.add(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int t:
             ab) {
            System.out.println(t);
        }

    }

}

class chek3 extends Thread
{
    ArrayList<Integer> a= new ArrayList<>();
    @Override
    public void run() {
        super.run();
       for (int i=0;i<5;i++)
       {
        a.add(i*2);
           try {
               Thread.sleep(201);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        Iterator i= a.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());

        }
    }
}
class bhago5
{
    public static void main(String args[])throws IOException
    {
        check2 r= new check2();
        chek3 r1= new chek3();
        r.start();
        r1.start();
    }
}