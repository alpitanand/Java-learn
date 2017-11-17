import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 11-07-2016.
 */
public class lrk {
    public static void main(String args[])throws IOException
    {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int l,r,k,m=0;
        l=Integer.parseInt(obj.readLine());
        r=Integer.parseInt(obj.readLine());
        k=Integer.parseInt(obj.readLine());
        for(int t=l;t<=r;t++)
        {
            if(t%k==0)
            {
                 m=m+1;
            }
        }
    System.out.println(m);
    }
}
