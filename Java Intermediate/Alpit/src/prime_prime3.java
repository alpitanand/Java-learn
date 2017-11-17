import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by Alpit on 16-08-2017.
 */
public class prime_prime3 {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(obj.readLine());
        int a = Integer.parseInt(st.nextToken());
        int count = 0;
        int count2 = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1,0);
        boolean m[] = seiveoferoth();
        for (int k = 2; k <= 1000000; k++) {
            if (m[k]) {
                count++;
                hashMap.put(k, count);

            }

            else {
                hashMap.put(k,count);
            }
        }
        for (int i = 0; i < a; i++) {
            String s = obj.readLine();
            String t[] = s.split(" ");

            int b = Integer.parseInt(t[0]);
            int c = Integer.parseInt(t[1]);
            for (int r = b; r <= c; r++) {

                int val = hashMap.get(r);
                if (m[val]) {
                    count2++;
                }
            }
            System.out.println(count2);
            count2 = 0;


        }

    }

    private static boolean[] seiveoferoth() {
        int c = 1000000;


        boolean prime[] = new boolean[c + 1];

        for (int i = 0; i <= c; i++) {
            prime[i] = true;
        }
        for (int i = 2; i * i <= Math.sqrt(c); i++) {
            if (prime[i]) {
                for (int h = 2 * i; h <= c; h += i) {
                    prime[h] = false;
                }
            }
        }
        return prime;

    }
}
