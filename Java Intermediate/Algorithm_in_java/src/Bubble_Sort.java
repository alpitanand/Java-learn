import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 10-05-2017.
 */
public class Bubble_Sort {
    public static void main(String args[])throws IOException
    {
        int temp;
        int b[]= new int[10];
        BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 number ");
        for(int i=0;i<10;i++)
       {
           b[i]=Integer.parseInt(obj.readLine());
       }

    for(int k=0;k<b.length;k++)
    {

        for (int u = k+1; u < b.length; u++)
        {
            if(b[k]>b[u])
            {
                temp=b[u];
                b[u]=b[k];
                b[k]=temp;
            }
        }
    }
        for(int v:b)
        {
            System.out.println(v);
        }


    }
}
