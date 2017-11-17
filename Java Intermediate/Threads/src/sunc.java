import java.io.IOException;

/**
 * Created by Alpit on 19-05-2017.
 */
public class sunc {
    synchronized void printabe(int i) {
        int j=0;
        for (int k = 0; k < i; k++) {
            //System.out.println(k+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
   j++;
    System.out.println(j+" This is from "+Thread.currentThread().getName());
    }
}

class t1 extends Thread {
   sunc y;
    t1(sunc s)
    {
        y=s;
    }

    @Override
    public void run() {
        super.run();
y.printabe(10);
    }
}

class t2 extends Thread {
sunc r;
     t2(sunc m)
    {
       r=m;
    }
    public void run() {
        super.run();
        r.printabe(10);
    }
}

class t3 extends Thread {
    sunc r;
    t3(sunc m)
    {
        r=m;
    }
    public void run() {
        super.run();
        r.printabe(10);
    }
}
class t4 extends Thread {
    sunc r;
    t4(sunc m)
    {
        r=m;
    }
    public void run() {
        super.run();
        r.printabe(10);
    }
}

class father {
    public static void main(String args[]) throws IOException {
        sunc sunc= new sunc();
        sunc sunc1= new sunc();
        t1 t1 = new t1(sunc);
        t2 t2 = new t2(sunc);
        t3 t3= new t3(sunc1);
        t4 t4= new t4(sunc1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
