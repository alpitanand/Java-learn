import java.io.IOException;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit7 {
    public static void main(String args[]) throws IOException {
        int z = 0;
        for (int i = 1; i <= 100; i++) {
            z = z + i;
        }
        System.out.println(z);

        int t = 5050 - 4949;
        System.out.println(t);
int e=0;
        for (int i = 1; i <= 100; i++)
        {
            for (int j = 2; j <= 99; j++)
            {
                if(i+j==101)
                {
                    e++;
                }
            }
        }
        System.out.println(e);
    }
}
