import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 25-09-2017.
 */
public class recur_fact {
    public static void main(String args[])throws IOException{
        BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
       int z = factorial(a);
        System.out.println(z);
    }

    private static int factorial(int a) {
        if(a==1){
            return 1;
        }
        else {
           return a*factorial(a-1);
        }
    }
}
