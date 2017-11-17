import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 10/2/2016.
 */
public class noinasendig {
    public static void main(String arga[])throws IOException
    {
       int u=0;
        int t=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no");
        int a= Integer.parseInt(obj.readLine());
        int b=a;
      int c=a;
        while(a!=0)
        {
            a=a/10;
            t++;
        }
    int arr[]= new int[t];
    while(b!=0)
    {
        int d=b%10;
        arr[u]=d;
        b=b/10;
        u++;
    }

        for(int i=0;i<t-1;i++)
        {
      for(int j=1;j<t;j++)
{
    if(arr[i]>arr[j])
    {
        int r=arr[i];
        arr[i]=arr[j];
        arr[j]=r;

    }
}
        }

    for(int o=0;o<t;o++)
    {
        System.out.print(arr[o]);
    }


    }



}
