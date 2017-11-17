import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 07-07-2017.
 */
public class recur {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int a = Integer.parseInt(obj.readLine());
        int b = fact(a);
        System.out.println(b);
        System.out.println("Addition of digits of numbers");
        int number = Integer.parseInt(obj.readLine());
        int sum = sum(number);
        System.out.println(sum);
    }

    private static int sum(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + sum(number / 10);
        }
    }

    private static int fact(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * fact(a - 1);
        }
    }
}
