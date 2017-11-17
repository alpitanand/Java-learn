import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 10/1/2016.
 */
public class implemetation {
static int f=0;
    public static void main(String args[])throws IOException
    {
        int a;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        a= Integer.parseInt(obj.readLine());
   int b= lengthno(a);

   storeinarr(b,a);
    }

    private static void storeinarr(int y,int u) {
        int counter=0;
        int arr[]= new int[y];
        int v=y;
        int q= (int) u;
        while(q!=0)
        {
            int d=q%10;
            arr[f]=d;
            q=q/10;
            f++;

        }

    for(int b=0;b<=9;b++) {
        for (int z = 0; z < v; z++) {
            if (arr[z] == b) {
                counter++;
            }
        }

            System.out.println(b + " " + counter);
            counter = 0;

    }
    }

    private static int  lengthno(int e) {
       int y=0;

        while(e!=0)
        {
            e=e/10;
           y++;
        }
        return y;
    }
}
