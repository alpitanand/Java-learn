import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 22-07-2016.
 */
public class sherlockndxor {
    public static void main(String args[])throws IOException
    {
        int a;
        BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
        a= Integer.parseInt(obj.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0;i<a;i++)
        {
            int b;
            b=Integer.parseInt(obj.readLine());
            for(int h=0;h<b;h++)
            {

                int c;
                c=Integer.parseInt(obj.readLine());
                arr.add(c);

            }
                  sherlock(arr);   //Alpit function is a very great thing always us e function
            arr.clear();
        }
    }

    private static void sherlock(ArrayList<Integer> arr) {
          int y =arr.size();
        int c=0;
        for(int u=0;u<y;u++)
        {
            for(int r=u;r<y;r++)
            {

            }
        }
System.out.println(c);
    c=0;
    }
}
