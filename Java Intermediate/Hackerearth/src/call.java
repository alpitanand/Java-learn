import java.io.IOException;

/**
 * Created by Alpit on 15-03-2017.
 */
public class call {
    public static void main(String args[])throws IOException
    {
        boxweight b= new boxweight(10,3,20,10);
       b.area();
        System.out.print(b.vol());
       boxweight r=new boxweight(b);
    }
}
