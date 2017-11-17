import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 27-07-2017.
 */
public class permutate {
    public static void main(String args[]) {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String s = "ABC";
        int t = s.length();
        String m = "";
        perm(s, m);

    }

    private static void perm(String s, String k) {
        int n = s.length();
        if (n == 0) {
            System.out.println(k);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(k + s.charAt(i)+"**"+i);
            perm(s.substring(0, i) + s.substring(i + 1, n), k + s.charAt(i));
        }

    }
}
