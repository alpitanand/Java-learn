import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 08-07-2016.
 */
public class Modulo {
    public static void main(String args[])throws IOException
    {
        double k=1;
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int i=Integer.parseInt(in.readLine());
        int num[]= new int[i];
        for(int j=0;j<i;j++)
        {
         num[j]=Integer.parseInt(in.readLine());
            k = (k * num[j]) % 1000000007;
        }
    System.out.println((int)(k));
    }
}
