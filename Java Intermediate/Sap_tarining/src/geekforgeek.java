import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class geekforgeek {
    public static void main(String[] args) throws IOException {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(obj.readLine());
        int a[] = new int[i];
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int j = 0; j < i; j++) {
            a[j] = Integer.parseInt(obj.readLine());
        }

        for (int r = 0; r < i; r++) {

            if (r == 0) {
                arr.add(a[r]);
                System.out.println(a[r]);
            } else {
                arr.add(a[r]);
                Collections.sort(arr);
                if (arr.size() % 2 == 0) {
                    int m = arr.size() / 2;
                    System.out.println((arr.get(m - 1) + arr.get(m)) / 2);
                } else {

                    System.out.println(arr.get(arr.size() / 2));
                }
            }
        }
    }
}
