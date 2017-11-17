import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Alpit on 28-06-2017.
 */
public class simple_encoded_array {
    public static void main(String args[]) throws IOException {
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        //int a[] = {3,-4,6,2,-6,3};
        //int a[] = {-18, 13, -18, -15};
        //int a[]={3};
        int a[] = {-46, 53, 15, -23, 0, -6, 95, -68, 32, 53};
        arr.add(a[a.length - 1]);
        for (int i = a.length - 2; i >= 0; i--) {
            a[i] = a[i + 1] - a[i];
            arr.add(a[i]);
        }
        for (int i : arr) {
            System.out.println(i);
            count = count + i;
        }
        System.out.println("=====================================");
        System.out.println(arr.get(arr.size() - 1));
        System.out.println(count);
    }
}
