import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 17-09-2016.
 */
public class dectobin {

    // this porgram we are making dec to binary no

    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no");
        int a = Integer.parseInt(obj.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int t = a;

        while (t != 0) {
            int l = t & 1;
            arr.add(l);
            t = t >> 1;
        }
        int z = arr.size();
        for (int i = z - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
        }
    }
}
