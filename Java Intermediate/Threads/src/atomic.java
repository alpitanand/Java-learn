import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Alpit on 20-05-2017.
 */
public class atomic extends Thread{

    int c=26;

    @Override
    public void run() {
        super.run();
    synchronized (this) {
        c++;
    }
        AtomicInteger a= new AtomicInteger(26);
        System.out.println(a.incrementAndGet());
        System.out.println(c+" "+Thread.currentThread().getName());
    }
}
class huyaa
{
 public static void main(String args[])throws IOException
 {
     atomic a= new atomic();
     atomic a2= new atomic();
     a.start();
     a2.start();
 }
}
