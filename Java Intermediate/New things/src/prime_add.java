import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Alpit on 15-06-2017.
 */
public class prime_add {
    public static void main(String args[]) throws IOException {
        int count = 0;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number to be checked");
        int a = Integer.parseInt(obj.readLine());
        for (int i = 10; i < 100; i++) {
            for (int j = 2; j < (i / 2) + 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                arr.add(i);
            }
            count = 0;
        }
        Stack<Integer> st = new Stack<>();
        for (int b : arr) {
            st.push(b);
        }
        while (sum != a) {
            if (st.peek() > a ) {
           st.pop();
            } else if (st.peek() < a) {
                sum = sum + st.peek();
                if(sum>a)
                {
                    sum = sum - st.peek();
                    System.out.println(st.pop());

                }
                System.out.println(sum);
                st.pop();
                count++;
            }

        }
        System.out.println(count);


    }
}
