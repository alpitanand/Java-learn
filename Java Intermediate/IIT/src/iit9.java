import java.io.IOException;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit9 {
    public static void main(String args[])throws IOException
    {
int c=0;
        for(int i=10000;i<99999;i++)
        {
            int u = check_block(i);
        if(u%15==0)
        {
            c++;
            System.out.println(c);

        }
        }
    }

    private static int check_block(int i) {
       int z=0;
        int r=i;
        while(i!=0)
        {
            int k=i%100;
            if(k==15)
            {
               z=1;
break;
            }
            i=i/100;

        }
    if(z==1)
    {
        return r;
    }
      else
    {
        return 1;
    }
    }
}
