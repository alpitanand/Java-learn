
import java.io.IOException;

import java.util.ArrayList;

/**
 * Created by Alpit on 26-05-2017.
 */
public class dammo_prime {
    static ArrayList<Integer> arr= new ArrayList<>();
    public static void main(String args[]) throws IOException {
        for (int i = 67; i < 130; i++) {
            crpime(i);
        }
    }

    private static void crpime(int i) {
        int c = 0;
        for (int j = 2; j <= (i / 2 + 1); j++) {
            if (i % j == 0) {

                c++;
                break;
            }
        }

        if (c == 0) {
            System.out.println(i);
            arr.add(i);
        }
    }


}

