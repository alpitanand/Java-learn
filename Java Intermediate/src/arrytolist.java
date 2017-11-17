import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Alpit on 29-11-2016.
 */
public class arrytolist {
    public static void main(String args[])
    {
        String things[]={"alpit","is","a","great","guy"};

        LinkedList<String> list= new LinkedList<>(Arrays.asList(things));
list.add("pumpkin");
   for(int i=0;i<4;i++)
   {
       System.out.println(list.get(i));
   }
    }
}
