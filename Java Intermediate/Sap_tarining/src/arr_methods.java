import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Alpit on 01-07-2017.
 */
public class arr_methods {
    public static void main(String arg[])
    {
        int a[] = {12,2,3,45,46,45,25,45,45,4};
        int b[] = {2,34,3,4,4,23,4,235,24,6,57,56,76};
        int c[] = new int[5];
        System.out.println(Arrays.equals(a,b));
        Arrays.fill(c,5);
        Arrays.sort(a,0,5);

        for (int i:a)
        {
            System.out.println(i);
        }

    }
}
