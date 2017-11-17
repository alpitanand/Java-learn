import java.io.IOException;


public class join extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i +" from current thread "+Thread.currentThread().getName());
        }
    }
}

class bhago4 {
    public static void main(String args[]) throws IOException {

        join j1 = new join();
        join j2 = new join();
        join j3 = new join();
        j3.start();
j1.start();
        try {
            j1.join(501);

        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        j2.start();
    }
}
