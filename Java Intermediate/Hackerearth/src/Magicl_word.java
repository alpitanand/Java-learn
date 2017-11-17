import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 02-06-2017.
 */
public class Magicl_word {
    public static void main(String args[]) throws IOException {
        int testCase, length;
        String test;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        testCase = Integer.parseInt(obj.readLine());
        for (int i = 0; i < testCase; i++) {

            length = Integer.parseInt(obj.readLine());
            test = obj.readLine();
            replace(length, test);
        }


    }

    private static void replace(int length, String test) {
        int diff = 999, diff1 = 999;
        int num1 = 0, num2 = 0;
        String s = "";
        for (int i = 0; i < length; i++) {
            int c = (int) test.charAt(i);
            boolean check = checkifprime(c);
            if (check) {

                s = s + (char) c;

            } else {
                for (int k = c; k <= 122; k++) {
                    if (checkifprime(k)) {
                        diff = k - c;
                        num1 = k;
                        break;
                    }

                }
                for (int m = c; m >= 65; m--) {
                    if (checkifprime(m)) {
                        diff1 = c - m;
                        num2 = m;
                        break;
                    }
                }

            }
            if (diff < diff1) {
                s = s + (char) num1;
            } else if (diff > diff1) {
                s = s + (char) num2;
            } else if (diff == diff1) {
                if (num1 < num2) {
                    s = s + (char) num1;
                } else {
                    s = s + (char) num2;
                }
            }
            diff = 999;
            diff1 = 999;
            num1 = 0;
            num2 = 0;
        }

        System.out.println(s);
    }


    private static boolean checkifprime(int c) {

        for (int i = 2; i < c / 2 + 1; i++) {
            if (c % i == 0) {
                return false;
            }
        }
        return true;
    }
}
