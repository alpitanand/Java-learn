import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 07-07-2016.
 */
public class NuS {
    public static void main(String args[])throws IOException
    {
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int i= Integer.parseInt(in.readLine());


        String s= in.readLine();
        System.out.println(i*2);
        System.out.println(s);
    }
}
