import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 06-05-2017.
 */
public class dupli {
    public static void main(String args[])throws IOException
    {
        int b[]= new  int[5];
        BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));

        for(int k=0;k<5;k++)
        {
            b[k]=Integer.parseInt(ob.readLine());
        }

    for(int m=0;m<5;m++)
    {
        for (int l=m+1;l<5;l++)
        {
            if(b[m]==b[l])
            {
                System.out.println("Duplicate");
            }
        else System.out.println("Not Duplicate");
        }
    }

    }
}
