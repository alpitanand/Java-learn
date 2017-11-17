import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Alpit on 14-03-2017.
 */
public class queue extends Pallindrome{
    public static void main(String args[])throws IOException {

        Queue queue = new LinkedList();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        queue.add("7");
        queue.add("8");
        queue.add("9");
        Iterator iterator = queue.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        for(Object o:queue)
        {
            System.out.println(o);
        }
        Object i=queue.remove();


    }

}
