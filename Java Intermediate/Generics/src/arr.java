import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Alpit on 18-06-2017.
 */
public class arr {
    public static void main(String args[])
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        Iterator<Integer> iterator= arr.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next());
        }

    }

}
