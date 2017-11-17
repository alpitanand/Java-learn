import java.io.IOException;

/**
 * Created by Alpit on 28-06-2017.
 */
public class Thre extends Thread {

    @Override
    public void run() {
        //super.run();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Alpit is a great guy");
    }
}
class pra {
    public static void main(String args[])throws IOException
    {
        Thre t= new Thre();
ALpit al= new ALpit();
Thread tm= new Thread(al);
tm.start();
        t.start();
    }
}
class ALpit implements Runnable{

    @Override
    public void run() {
        System.out.println("Alpit is a good programmer");
    }
}
