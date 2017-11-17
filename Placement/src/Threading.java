/**
 * Created by Alpit on 03-09-2017.
 */
public class Threading extends Thread {
    public void run(){
        System.out.println("Running");
    }
    public static void main(String args[]){
        Threading threading = new Threading();
        threading.start();
    }
}

class watch implements Runnable{

    @Override
    public void run() {
System.out.println("It is running");
    }
public static void main(String args[]){
        watch watch = new watch();
        Thread thread= new Thread(watch);
        thread.start();
}
}

