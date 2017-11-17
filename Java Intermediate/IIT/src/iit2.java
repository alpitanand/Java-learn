import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit2 {
    public static void main(String args[]) throws IOException {
int e=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1000; i <= 9999; i++) {
            if (i % 4 == 0) {
                if (i % 8 != 0) {
                int y=   check_zero(i);
                if(y>0)
                {
                    e++;
                }
                }
            }
        }
   System.out.println(e);
    }

    private static int check_zero(int i) {
        int t=i;
        while(i!=0)
        {
            int u= i%10;
            if(u==0)
            {
                return 0;

            }
        i=i/10;
        }
    return t;
    }

}
