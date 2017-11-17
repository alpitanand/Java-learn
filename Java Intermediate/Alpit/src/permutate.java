import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 05-04-2017.
 */
public class permutate {
    public static void main(String args[])throws IOException {
        int t = 1;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String s = obj.readLine();
        int a = s.length();
        permutation(s);
while(a!=0)
{
    t=t*a;
    a--;
}





    }
    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
