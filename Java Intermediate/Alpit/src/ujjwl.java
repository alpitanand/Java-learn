import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Alpit on 30-05-2017.
 */
public class ujjwl {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String s = obj.readLine();
        int a = Integer.parseInt(obj.readLine());
        String t[] = s.split(" ");
        boolean p = primeExist(t);
        if (p) {
            // System.out.println("Yes");
            sumOfprime(t);
        } else {
           // System.out.println("NO");
            sumOfnumber(t);
        }
    }
    private static void sumOfnumber(String[] t) {
        int j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < t.length; i++) {
            arr.add(Integer.parseInt(t[i]));
        }
        int re = Collections.min(arr);
        for (int as : arr) {
            j = j + as;
        }
        System.out.println(j - re);
    }
    private static void sumOfprime(String r[]) {
        int y = 0;
        ArrayList<Integer> a = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < r.length; i++) {
            for (int w = 2; w < Integer.parseInt(r[i]); w++) {
                if (Integer.parseInt(r[i]) % w == 0) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                a.add(Integer.parseInt(r[i]));
            }
            c = 0;
        }
        int k = Collections.min(a);
        //System.out.println(k);
        for (int q : a) {
            y = y + q;
        }
        System.out.println((y - k));
    }

    private static boolean primeExist(String k[]) {
        int c = 0;
        for (int i = 0; i < k.length; i++) {
            for (int e = 2; e < Integer.parseInt(k[i]); e++) {
                if (Integer.parseInt(k[i]) % e != 0) {
                    c++;
                }
            }
            if (c == (Integer.parseInt(k[i])) - 2) {
                return true;
            }

            c = 0;
        }
        return false;
    }
}

