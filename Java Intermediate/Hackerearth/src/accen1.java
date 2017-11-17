import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 11-02-2017.
 */
public class accen1 {
    public static void main(String args[] )throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(obj.readLine());
        for(int i=0;i<t;i++)
    {
        String l=obj.readLine();
        String part[]=l.split(" ");

        double a = Double.parseDouble(part[0]);
        long b= (long) Double.parseDouble(part[1]);
        double c=Math.pow(b,(1/a));
        if(c%1==0)
        {
            System.out.println((int)c);
        }
        else
            System.out.println(-1);
    }
    }
}
