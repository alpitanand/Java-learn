import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 06-05-2017.
 */
public class Xsquar_double {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        for (int i = 0; i < a; i++) {
            String s = obj.readLine();
            String b[] = s.split("");
            duplicate(b);
        }
    }

    private static void duplicate(String[] b) {
        int c=0;
        for (int l = 0; l < b.length; l++) {

            for (int k = l+1; k < b.length; k++)
            {
                if (b[l].equals(b[k])) {
                    c++;
                }
            }
if(c>=1)
{
    System.out.println("YES");
    break;
}
        }
        if(c<1)
        {
            System.out.println("NO");
        }

        }

    }

