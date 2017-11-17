import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 16-07-2016.
 */
public class Subset {

   static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String args[]) throws IOException {

        ArrayList<Integer> str = new ArrayList<>();

        int u = Integer.parseInt(obj.readLine());



for(int r=0;r<u;r++) {
    subset(str);
}
    }

public static void subset(ArrayList<Integer> str)throws IOException{

    int  k = Integer.parseInt(obj.readLine());
        for (int h = 0; h < k; h++) {
            int g = Integer.parseInt(obj.readLine());
            str.add(g);

        }
        int subset = 1 << k;
        System.out.println(subset);

        for (int j = 0; j < subset; j++) {
            int mask = 1;
            ArrayList<Integer> e = new ArrayList<>();
            for (int y = 0; y < k; y++) {
                if ((mask & j) != 0) {
                    e.add(str.get(y));
                }
                mask = mask << 1;
            }
            for (int r : e) {
                System.out.print(r);
            }

            System.out.println();
        }

    }
}


