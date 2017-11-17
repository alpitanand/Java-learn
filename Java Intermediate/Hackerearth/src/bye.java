import java.io.IOException;

/**
 * Created by Alpit on 14-03-2017.
 */
public class bye {
   int i=10;
    int j=20;
    bye()
    {

    }
    bye(int i,int j){
        System.out.println("From constructor");
        i=40;
        j=50;
    }
    public static void main(String args[])throws IOException
    {
        System.out.println("**");
    }
public void say()
{
    System.out.println("bye from bye");
}
}
