import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 22-10-2016.
 */
public class Reverse {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(obj.readLine());
        int b[]= new int [a];
        for(int i=0;i<a;i++)
        {
            b[i]=Integer.parseInt(obj.readLine());
        }
        for(int i=a-1;i>=0;i--)
        {
           System.out.println(b[i]);
        }
    }
}
