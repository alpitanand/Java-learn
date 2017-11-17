import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Alpit on 18-05-2017.
 */
public class Thread_pool extends Thread{
   String s;
    public void Thread_pool(String s)
    {
        this.s=s;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+ s);
        processmessage();//call processmessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name
    }
    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }


}
class alpit1 {
    public static void main(String args[]) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++)
        {
            Thread_pool thread_pool = new Thread_pool();
            executorService.execute(thread_pool);
        }
        executorService.shutdown();
    }
}
