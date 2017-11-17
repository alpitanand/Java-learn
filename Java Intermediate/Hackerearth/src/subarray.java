import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Alpit on 11-05-2017.
 */
public class subarray {
    public static void main(String args[])throws IOException
    {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(7);
        a.add(1);
        a.add(5);
        a.add(1);
        a.remove(1);
for(int b:a)
{
    System.out.println(b);
}
    }

}
