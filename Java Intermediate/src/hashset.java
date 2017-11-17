import java.util.*;

/**
 * Created by Alpit on 29-11-2016.
 */
public class hashset {
    public static void main(String args[])
    {
       String things []={"alpit","is","a","great","great","guy"};
        List<String> list = Arrays.asList(things);
       System.out.print(list);
        Set<String> hash= new HashSet<String>(list);{
        System.out.print(hash);
        }
    }
}
