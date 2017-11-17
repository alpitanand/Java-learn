import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 10/17/2016.
 */
public class implementation2 {
    public static void main(String args[])throws IOException
    {


        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a;
        String s;
        int count=0;

        s=obj.readLine();
        a= s.length();
        for(int k=0;k<10;k++)
        {
            for(int j=0;j<a;j++)
            {
                if((Integer.toString(k).charAt(0))==s.charAt(j))
                {
                    count++;
                }
            }
        System.out.println(k+" "+count);
            count=0;
        }
    }
}
