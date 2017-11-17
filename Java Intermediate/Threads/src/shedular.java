import java.io.IOException;

/**
 * Created by Alpit on 17-05-2017.
 */
public class shedular extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<1000;i++)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(i);
        }


    }
}

class bhago3
{
    public static void main(String args[])throws IOException
    {
        shedular sh= new shedular();
        //shedular sh1= new shedular();
        sh.start();
       // sh1.start();
        sh.start();
    }
}
