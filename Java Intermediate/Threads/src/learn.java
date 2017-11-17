import java.io.IOException;

/**
 * Created by Alpit on 17-05-2017.
 */
public class learn extends Thread{

    @Override
    public void run() {
        System.out.println("THread is running");

    }
}
class bhagao {
    public static void main(String args[]) throws IOException
    {
learn l= new learn();
        l.start();
    }
}