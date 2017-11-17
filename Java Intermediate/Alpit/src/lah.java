import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 04-04-2017.
 */
public class lah {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
        String s=obj.readLine();
        String a[]=  s.split(" ");
        for(String x: a)
        {
            System.out.println(x);
        }
    }
}
