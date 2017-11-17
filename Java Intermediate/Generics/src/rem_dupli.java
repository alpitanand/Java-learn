import java.util.HashSet;

/**
 * Created by Alpit on 18-06-2017.
 */
public class rem_dupli {
    public static void main(String args[])
    {
        int a []={1,2,3,4,5,6,7,8,8,1,2,3};
        HashSet<Integer> hashSet= new HashSet<>();
        for(int b:a)
        {
            while (hashSet.add(b))
            {
                hashSet.add(b);
            }
        }
    for(int c:hashSet)
    {
        System.out.println(c);
    }
    }
}
