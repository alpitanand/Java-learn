import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 20-07-2016.
 */
public class add2 {
    public static void main(String args[])throws IOException
    {
        System.out.println("input two number");
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        int b= Integer.parseInt(obj.readLine());
        int c= a-(-b);
        System.out.println(c);
    }

}
