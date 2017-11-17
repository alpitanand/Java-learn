import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Alpit on 13-07-2016.
 */
public class bitmainipulation {
    public static void main(String args[])throws IOException
    {
        int m=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a = new ArrayList<>();
        int b= Integer.parseInt(obj.readLine());
    for(int i=0;i<b;i++)
    {
        int c= Integer.parseInt(obj.readLine());
        a.add(c);
    }
    for(int x:a)
    {
        int t=x;
        while (t!=0)
        {
            t=t&(t-1);
            m++;
        }
    System.out.println(m);
    m=0;
    }
    }
}
