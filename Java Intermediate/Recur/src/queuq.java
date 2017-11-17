/**
 * Created by Alpit on 18-07-2017.
 */
// http://practice.geeksforgeeks.org/problems/finding-position/0

public class queuq {
    static int n = 1;
    static int a = 13;
    static int y=0;

    public static void main(String args[]) {

        int b = checkqueue(n);
        System.out.println(b/2);
    }

    private static int checkqueue(int n) {

        if (n >= a) {
            y=n;

        } else {
            n *= 2;

            checkqueue(n);


        }
    return y;
    }
}
