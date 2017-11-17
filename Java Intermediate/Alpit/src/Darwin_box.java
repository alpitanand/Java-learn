import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 04-04-2017.
 */
public class Darwin_box {
    static int c;
    public static void main(String args[])throws IOException
    {
        BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ener the number of pebbles");
        int a= Integer.parseInt(obj.readLine());

        while ((a>=5))
        {
            a=a-5;
            c++;
        }
        while (a>=3)
        {
            a=a-3;
            c++;
        }
        while (a>=2)
        {
         a=a-2;
            c++;
        }
//
//        if(a==5||a==3||a==2)
//        {
//           c++;
//        }
    System.out.println(c);
        if((c%2)!=0)
        {
System.out.println("Alice");
        }
        else
        {
            System.out.println("Bob");
        }
    }
}
