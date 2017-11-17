import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 10-07-2016.
 */
public class factorial {
    public static void main(String args[])throws IOException
    {
        int b=1;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        for(int k=1;k<=a;k++)
        {
            b=b*k;
        }
   System.out.println(b);
    }
}
