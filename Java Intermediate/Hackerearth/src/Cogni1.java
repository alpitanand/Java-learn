import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;

/**
 * Created by Alpit on 15-07-2017.
 */
public class Cogni1 {
    public static void main(String args[])throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(obj.readLine());
        BigInteger a[]=new BigInteger[r];
        String s=obj.readLine();
        String s1[]=s.split(" ");
        for(int m=0;m<s1.length;m++){
            a[m]=new BigInteger(s1[m]);

        }

       long b = solve(a);
        System.out.println(b);
    }

    private static long solve(BigInteger[] a) {
        long l=0;
        int k = a.length;
long o;
        for (int i = 0; i < k; i++) {
            int count = 0;
            int y = a[i].bitCount();

            l=l+(long) Math.pow(y,i+1);
        }
      o=(long)  ( l%(Math.pow(10,10)+11));
    return  o;
    }
}
