import java.io.IOException;

/**
 * Created by Alpit on 15-05-2017.
 */
public interface request {
void add();
    void sub();

}

abstract class mob implements request
{
    static int a;
    static int b;
    public static void main(String args[])throws IOException
    {
        a=10;
         b=5;
    }
  abstract   void alpit();

}
class prac extends mob{


    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }

    @Override
    void alpit() {

    }
}

