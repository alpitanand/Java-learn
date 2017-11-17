import java.io.IOException;

/**
 * Created by Alpit on 17-05-2017.
 */
public class Implement_thread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
class bahgao2
{
    public static void main(String args[])throws IOException
    {
        Thread t= new Thread(new Implement_thread());
        t.start();
    }
}
