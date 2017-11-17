import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 16-07-2017.
 */
public class Recursion1 {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        int b = 2;
        int cur_num = 1;
        double cur_sum = 0;
        double x = recur(a, b, cur_num, cur_sum);
        System.out.println(x);

    }

    private static double recur(int a, int b, int cur_num, double cur_sum) {
        double p = Math.pow(cur_num, b);
        double results = 0;
        while (p + cur_sum < a) {
            System.out.println(a+" "+b+" "+cur_num+" "+(cur_sum)+"==");
            results += recur(a, b, cur_num + 1, p + cur_sum);
            System.out.println(a+" "+b+" "+(cur_num)+" "+(cur_sum));
            cur_num++;
            p = Math.pow(cur_num, b);
            System.out.println(cur_num+" "+p);

        }
        if (p + cur_sum == a) {
            results++;
        }
        return results;
    }


}
