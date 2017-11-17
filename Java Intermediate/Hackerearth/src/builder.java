import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 13-05-2017.
 */
public class builder {
    public static void main(String args[])throws IOException
    {

        //StringBuilder s= new StringBuilder("");
        String t="";

        for(int i=0;i<50000;i++)
        {
            //s=s.append(i);
            t=t+i;
        }
        //System.out.println(s);
        //System.out.println(t);
        System.currentTimeMillis();


    }
}
