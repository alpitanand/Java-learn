import java.io.IOException;

/**
 * Created by Alpit on 19-05-2017.
 */
public class mum_mul implements Runnable{
    @Override
    public void run() {
        System.out.println("Priiinnttt");

    }

public static void main(String args[])throws IOException
{
    mum_mul mum_mul=new mum_mul();

    Thread t= new Thread(mum_mul);
    t.start();
}
}
