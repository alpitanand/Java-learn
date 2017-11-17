import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 15-08-2017.
 */
public class Prime_Prime {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        for (int i = 0; i < a; i++) {
            String s = obj.readLine();
            String t[] = s.split(" ");
            int check = primeprime(t);
            System.out.println(check);
        }
    }

    private static int primeprime(String[] t) {
        int count = 0;
        int a = Integer.parseInt(t[0]);
        int b = Integer.parseInt(t[1]);
        for (int j = a; j <= b; j++) {
            int k = checkNumberofPrime(j);

            boolean b1 = checkifprime(k);
            if (b1) {
                count++;
            }
        }
        return count;
    }

    private static boolean checkifprime(int k) {
        int flag =0;

        for (int i = 2; i <= (int) Math.sqrt(k); i++) {
            if (k % i == 0) {

                flag=1;
                break;

            }

        }

       if(flag==0){

            return true;
       }
       return false;
    }

    private static int checkNumberofPrime(int j) {
        int count = 0;
        int check = 0;
        for (int i = 1; i <= j; i++) {
            for (int y = 2; y <= (int)Math.sqrt(i); y++) {
                if (i % y == 0) {
                    check = 0;
                    break;
                } else {
                    check = 1;
                }
            }
            if (check == 1) {
                count++;

            }
            check = 1;

        }

        return (count);
    }

}
