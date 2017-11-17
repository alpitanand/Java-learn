import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 10/18/2016.
 */
public class great_kian {
    public static void main(String args[])throws IOException
    {
       int k=0;
        int m=0;
       int z=0,l=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        int a =Integer.parseInt(obj.readLine());
        ArrayList<Integer> b=new ArrayList<>();

        for(int i=0;i<a;i++)
        {
            int c=Integer.parseInt(obj.readLine());
            b.add(c);
        }
   for(int j=0;j<a;j=j+3)
   {

       if((j)>=a) {
           break;
       }
           k= k+b.get(j);

   }
        for(int j=1;j<a;j=j+3)
        {

            if((j)>=a) {
                break;
            }
            m= m+b.get(j);

        }
        for(int j=2;j<a;j=j+3)
        {

            if((j)>=a) {
                break;
            }
            z= z+b.get(j);

        }
    System.out.println(k+" "+m+" "+z);
    }
}
