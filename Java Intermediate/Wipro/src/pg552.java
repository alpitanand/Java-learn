import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 12-06-2017.
 */
public class pg552 {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
        String s=obj.readLine();
        String s2=obj.readLine();
        String s3[]=s.split("");
       for(int i=0;i<s3.length-1;i++)
       {
         if((s3[i]+s3[i+1]).equals(s2) && i!=0)
         {
             System.out.print(s3[i-1]+s3[i+s2.length()]);
         }
       }
    }
}
