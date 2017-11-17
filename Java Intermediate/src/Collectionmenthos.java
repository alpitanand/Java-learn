import java.util.*;

/**
 * Created by Alpit on 29-11-2016.
 */
public class Collectionmenthos {
    public static void main(String args[])
    {
        String stuff []={"apples","beef","corn","potatoes"};
        List<String> list = Arrays.asList(stuff);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("youtube");
        list2.add("google");
        list2.add("facebook");
        for (String x:list2
             ) {
System.out.println(x);
        }
        Collections.addAll(list2,stuff);
    System.out.println();
        for (String x:list2
                ) {
            System.out.println(x);
        }
    System.out.println(Collections.frequency(list2,"google"));
    boolean tof= Collections.disjoint(list,list2);
        System.out.println(tof);
    }
}
