import java.io.IOException;

/**
 * Created by Alpit on 28-06-2017.
 */
public class join_join extends Thread{
    @Override
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
class Wip
{
    public static void main(String args[]) throws IOException, InterruptedException {
        join_join join_join= new join_join();
        join_join.start();
        join_join.join();
        join_join join_join1= new join_join();
        join_join1.start();
        join_join join_join2 = new join_join();
        join_join2.start();
    }
}
