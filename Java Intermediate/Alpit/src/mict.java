import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 27-05-2017.
 */
public class mict {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        int k=0;
        int m=0;
        int c=0;
        String s=obj.readLine();
        String r=obj.readLine();
        String[] b=s.split(" ");
        String [] t=r.split(" ");
        for(int i=0;i<b.length;i++)
        {
//             k=k+Integer.parseInt(b[i]);
//            m=m+Integer.parseInt(t[i]);
            if(Integer.parseInt(b[i])<Integer.parseInt((t[i])))
            {
                System.out.println("NO");
            c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("YES");
        }


    }
}
