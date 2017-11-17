import java.io.IOException;

/**
 * Created by Alpit on 17-05-2017.
 */
public class chcek extends Thread {
    @Override
    public void run() {

        for(int i=0;i<5;i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    System.out.println(i);
        }
    }
}
class huya
{
    public static void main(String args[])throws IOException
    {
        chcek ch1= new chcek();
        chcek ch2= new chcek();
        ch1.start();
        System.out.println("jinda"+ch1.isAlive());
        ch2.start();

        System.out.println(ch2.isAlive());

    }
}
