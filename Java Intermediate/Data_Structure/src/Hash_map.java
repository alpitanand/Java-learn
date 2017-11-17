import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Alpit on 23-06-2017.
 */
public class Hash_map {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int find = findPassword(12, 1313, 122, 678, 898);
        System.out.println(find);


    }

    private static int findPassword(int i, int i1, int i2, int i3, int i4) {
        boolean k;
        ArrayList<Integer> stable = new ArrayList<>();
        ArrayList<Integer> unstable = new ArrayList<>();
        int arr[] = {i, i1, i2, i3, i4};
        for (int j = 0; j < arr.length; j++) {
            k = checkif(arr[j]);
            if (k) {
                stable.add(arr[j]);
            } else {
                unstable.add(arr[j]);
            }

        }

        return (Collections.max(stable) + Collections.min(unstable));
    }

    private static boolean checkif(int i) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        String s = Integer.toString(i);
        String arr[] = s.split("");
        for (int u = 0; u < arr.length; u++) {
            int y = Integer.parseInt(arr[u]);
            if (map.containsKey(y)) {
                map.put(y, map.get(y) + 1);
            } else {
                map.put(y, 1);
            }
        }

        for (Map.Entry mp : map.entrySet()) {
            hashSet.add((Integer) mp.getValue());
        }
        if (hashSet.size() == 1) {
            return true;
        }
        return false;


    }
}
