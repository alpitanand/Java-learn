import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

class Uncomman_char {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String s = obj.readLine();
            String k = obj.readLine();
            HashSet<String> hash = new HashSet<String>();
            HashSet<String> hashSet = new HashSet<String>();
            String m[] = s.split("");
            String h[] = k.split("");
            hash.addAll(Arrays.asList(m));
            hashSet.addAll(Arrays.asList(h));

            for (String x : h) {
                if (hash.add(x)) {
                    arr.add(x);
                }
            }
            for (String z : m) {
                if (hashSet.add(z)) {
                    arr.add(z);
                }


            }
            Collections.sort(arr);
            for (String v : arr) {
                System.out.print(v);
            }
        }

    }
}
