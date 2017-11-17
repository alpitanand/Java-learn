import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 20-07-2016.
 */
public class luckynumber {
    public static void main(String args[]) throws IOException {
        int count = 0, m = 0, y = 0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int h = 0; h < a; h++) {
            int j = Integer.parseInt(obj.readLine());
            arr.add(j);
        }

    for(int x:arr)
    {
        for(int i=0;i<=x;i++)
        {
            int p=i;
            while(p!=0)
            {
                p=p&(p-1);
                count++;

            }
           if(count==2)
            {
                y=y+i;
            }


        count=0;
        }
System.out.println(y%(Math.pow(10,7)));
    y=0;
    }
    }
}
