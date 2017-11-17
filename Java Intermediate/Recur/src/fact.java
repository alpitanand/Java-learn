import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 15-06-2017.
 */
public class fact {
    static int fact2 = 1;

    public static void main(String args[]) throws IOException {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        int c = factorial(a);
        System.out.println(c);
    }

    private static int factorial(int a) {
        if (a == 0)
            return 1;
        else
            System.out.println(a);
        return (a * factorial(a - 1));

    }
}
