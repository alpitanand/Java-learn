import java.io.IOException;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit14 {

    public static void main(String args[])throws IOException {
int rt=0;
        for (int i = 100; i <= 999; i++) {

int x= check_block(i);
        if(x>1)
        {
            rt++;
        }

        }
   System.out.println(rt);
    }





    private static int check_block(int i) {
        int z=0;
        int r=i;
        int y=i;
        int p=0;
        while(i!=0)
        {
            int k=i%10;
            if(k==5)
            {
                z=1;
                break;
            }
            i=i/10;

        }
        while(y!=0)
        {
            int g= y%10;
            if(g==3)
            {
                p++;
            }
           y=y/10;
        }
       if(p>1)
       {
           return 0;
       }
    else if(p<=1 & z==1)

       {
           return r;
       }
   else
       {
           return 0;
       }
    }
}
