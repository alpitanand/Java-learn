import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit3 {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
       int e,t=0;
        for(int i=100;i<=999;i++)
        {


         e=sum_of_number(i);
            if(e>9)
            {
            e=sum_of_number(e);
            if(e==2)
            {
                t++;
                System.out.println(t);
            }
            }

        }
    }

    private static int sum_of_number(int i) {
        int y=0;
        while(i!=0)
        {
            int k=i/10;
            y=y+k;
        i=i/10;
        }
    return y;
    }
}
