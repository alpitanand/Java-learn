/**
 * Created by Alpit on 17-07-2017.
 */
public class Binary_String {
    static int t = 0;

    public static void main(String args[]) {
        int a = 1933;
        int y = bin_str(a);
        System.out.println(y);
    }

    private static int bin_str(int a) {

        if (a ==0) {

            return a;

        } else {

            t = t + a % 10;
            bin_str(a / 10);



        }
        return t;
    }
}