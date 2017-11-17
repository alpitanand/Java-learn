import java.io.IOException;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.floor;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit13 {

    public static void main(String args[]) throws IOException
    {
        int c=0;
        for(int i=1;i<=5000;i++)
        {

            if(  floor(Math.sqrt(i))==floor(Math.sqrt(i+125)))
            {
                c++;
            }
        }
    System.out.println(c);
    }
}
