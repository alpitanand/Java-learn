import java.util.*;

/**
 * Created by Alpit on 29-11-2016.
 */
public class Sortinlist {
    public static void main(String args[]) {
        String things[] = {"alpit", "is", "a", "great", "guy"};
        List<String> l1 = Arrays.asList(things);
        Collections.sort(l1);
System.out.println(l1);


    }
}