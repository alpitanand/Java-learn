import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 01-08-2016.
 */
public class comp1 {
    static int c=0;
    public static void main(String args[])throws IOException
    {
        BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr= new ArrayList<>();
        int b =Integer.parseInt(ob.readLine());
        for(int j=0;j<b;j++)
        {
            for(int k=0;k<arr.size();k++) {
                factor(arr.get(k));

            }
        }
    }

    private static void factor(int o) {
        int r=o/2;
        for(int u=2;u<r;u++)
        {
            if(o/u==0)
            {
                c++;
            if(c>0)
            {
                break;
            }
            else
            {

            }
            }

        }
    ;
    }
}
