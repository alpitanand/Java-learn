import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 10-07-2016.
 */
public class life {
    public static void main(String args[]) throws IOException
    {
        int a;
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> array = new ArrayList<>();
      do
        {
            a=Integer.parseInt(ob.readLine());
            array.add(a);
        }  while(a!=42);
    for(int x: array)
    {
        if(x!=42) {

            System.out.println(x);

        }
    }
    }
}
