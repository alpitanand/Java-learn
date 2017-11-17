import java.io.IOException;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit8 {
    static int m=0;
    public static void main(String args[]) throws IOException
    {
        for(int i=100000;i<=999999;i++)
        {
            int r= sum_of_number(i);
        if(r==10)
        {
            int o = chek_digit(i);

            System.out.println(o);
        }
        }
    }

    private static int chek_digit(int i) {
        int z=0;

        while(i!=0)
        {
            int k= i%10;
            if((k==0)||(k==1)||(k==2)||(k==3))
            {
               z=1;
            break;
            }

            i=i/10;

        }
  if(z==1)
  {
      m=m+1;
      return m;
  }
    return 0;
    }

    private static int sum_of_number(int i) {
      int z=0;
        while(i!=0)
        {
            int k= i%10;
             z=z+k;
            i=i/10;
        }
    return z;
    }
}
