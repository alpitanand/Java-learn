/**
 * Created by Alpit on 02-09-2017.
 */
public class practice extends alpit3 implements alpit2 {
    public static void main(String args[]){
    practice p = new practice();
    p.faster();

    }
    @Override
    void faster() {
    super.run2();
    }

    @Override
    public void run() {

    }

    @Override
    public void fast() {

    }
}
interface alpit2{
    public void run();
    public void fast();
}

abstract class alpit3{
    public void run2(){
        System.out.println("run");
    }
    abstract void faster();

}
