import java.io.IOException;

/**
 * Created by Alpit on 18-05-2017.
 */
public class priority extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
class alpit {
    public static void main(String args[]) throws IOException {
        priority p = new priority();
        priority p2 = new priority();
        p.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);
        p.setName("Alpit");
        p2.setName("Prachee");
        p.start();
        p2.start();

    }

}