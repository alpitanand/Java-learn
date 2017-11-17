import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Alpit on 18-09-2016.
 */

public class iit {
    public static void main(String args[]) throws IOException
    {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

    for (int i= 1000;i<=9999;i++)
    {
        int k= 4*i;
        int y= revrse(i);
    if(y==k)
    {
        System.out.println(k);
        break;
    }
    else
    {
        System.out.println("not found");
    }
    }
    }

    private static int revrse(int i) {
          int j=i;
        int r=0;
        while(i!=0)
           {
               int e= i%10;
                r= (r*10)+e;
               i=i/10;

           }
    return r;
    }

}
