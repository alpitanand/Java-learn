import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 19-07-2016.
 */
public class debo {
    public static void main(String args[]) throws IOException {
        int j;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no");
        int k = Integer.parseInt(obj.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int m = k;
        while (m != 0) {
            int c = m % 10;
            arr.add(c);
            m = m / 10;
        }

        for (int y : arr) {
            System.out.println(y);
        }

        int u = arr.size();
        System.out.println("Printing size "+u);
        for (int r = u; r>0 ; r--) {
            if (r > 1) {
                j = arr.get(r -1) + arr.get(r - 2);
                System.out.println(j);
            }
        else {
                j = arr.get(u - 1) + arr.get(0);
                System.out.println(j);
            }
            }
    }
}