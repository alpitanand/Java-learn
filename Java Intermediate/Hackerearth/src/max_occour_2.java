import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 10-05-2017.
 */
public class max_occour_2 {
    public static void main(String args[])throws IOException
    {
        int c=0;
        BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the integer");
        int a= Integer.parseInt(obj.readLine());
        String b[]=Integer.toString(a).split("");
        for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;i<b.length;i++)
            {
                if(b[i].equals(b[j]))
                {
                    c++;
                }
            }
        System.out.println("Frequency of the element is "+b[i]+" "+c);
        c=0;
        }
    }
}
