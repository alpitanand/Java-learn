import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

/**
 * Created by Alpit on 29-07-2016.
 */
public class print {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int c=0;
        int a = Integer.parseInt(obj.readLine());
        for (int k = 1; k <= a; k++) {
            for (int u = 1; u <= k; u++) {
                int j = u ^ k;

                if (j <= a && u != k) {
                     c ++;
                    System.out.println(u + " " + k + "=" + j);
                }


            }

        }
        System.out.println(c);
    }
}