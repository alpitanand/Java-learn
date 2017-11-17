import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Alpit on 05-06-2017.
 */
public class UserMainCode {
    public static void main(String args[]) throws IOException {
        int a[] = {35, 658, 801, 459};
        int b = 4;
        long otp = OtpGen(a, b);
        System.out.print(otp);

    }

    public static long OtpGen(int[] input1, int input2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int min;
        int max;
        int min2;
        String s = "";
        //Coded by ALpit
        for (int i = 0; i < input2; i++) {
            s = s + Integer.toString(input1[i]);
        }
        String m[] = s.split("");
        for (int k = 0; k < m.length; k++) {
            arr.add(Integer.parseInt(m[k]));
        }
        min = Collections.min(arr);
        max = Collections.max(arr);
        int minmax;
        if (min == max) {
            minmax = 0;
        } else {
            minmax = max + min;
        }


        boolean t;
        int c = 0;
        for (int q = 0; q < input2; q++) {
            if (input1[q] > 99 && input1[q] < 999) {
                c++;
            }
        }
        if (c> 0) {
            t = true;
        } else {
            t = false;
        }


        if (t) {
            for (int i = 0; i < input2; i++) {
                if (input1[i] > 99 && input1[i] < 999) {
                    arrayList.add(input1[i]);
                } else if (input1[i] > 999) {
                    while (i > 99) {
                        int k = i % 1000;
                        arrayList.add(k);
                        i = i / 10;

                    }
                }

            }

        } else {
            arrayList.add(0);
        }
        min2 = Collections.min(arrayList);
        String otp = Integer.toString(min2) + Integer.toString(minmax);
        return Integer.parseInt(otp);
    }
}

