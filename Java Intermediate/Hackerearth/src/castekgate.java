import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 28-07-2016.
 */
public class castekgate {
   static int b=0;static int count=0;
    public static void main(String args[])throws IOException
    {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr= new ArrayList<>();
        int r =Integer.parseInt(obj.readLine());
        for(int i=0;i<r;i++)
        {
            int j= Integer.parseInt(obj.readLine());
            arr.add(j);
            count(arr,b);  // the power of function alpit...
            b++;
        }
    }

    private static void count(ArrayList<Integer> arr,int b) {
        for(int k=1;k<=arr.get(b);k++)
        {
            for (int u=1;u<=k;u++)
            {
                int y = u ^ k;
                if((y<=arr.get(b)) && (u!=k))
                {
                    count++;
                }
            }
        }
    System.out.println(count);
    count=0;
    }
}
