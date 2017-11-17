import java.io.IOException;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit4 {

    public static void main(String args[])throws IOException
    {
        int u=0;
        int r=0;
        for(int i=100;i<999;i++)
        {
         int t =odd(i);
            int j= even(i);

            if(t==j)
            {
                 u= u+i;
            }

        }
        System.out.println(u);
    }

    private static int even(int i) {
         int j=i;
       int c=0;
        while(j!=0) {

            int k = j % 10;
            if(k%2==0)
            {
                 c=c+1;
                break;
            }

            j=j/10;
        }


       return c;

    }

    private static int odd(int i) {
        int j=i;
       int n=0;
        while(j!=0) {

            int k = j % 10;
            if(k%2!=0)
            {
                n=n+1;
break;
            }

            j=j/10;
        }
    return n;
    }
}
