import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Alpit on 27-10-2016.
 */
public class MOnk_Rotation {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        //MAking no of test cases


        int a = Integer.parseInt(obj.readLine());

        for (int i = 0; i < a; i++) {
            String s = obj.readLine();
            String t[] = s.split(" ");
            int b = Integer.parseInt(t[0]);
            int l = Integer.parseInt(t[1]);
            int k = b - l % b;
            int p[] = new int[b];
            String r = obj.readLine();
            String g[] = r.split(" ");

            for (int m = 0; m < b; m++) {
                p[m] = Integer.parseInt(g[m]);

            }
            int copy[] = p.clone();

            for (int y = 0; y < p.length; y++) {
                int j = (y + k) % p.length;
                p[y] = copy[j];
            }

            for (int u : p) {
                System.out.print(u + " ");
            }
            System.out.println(" ");
        }
    }
}

