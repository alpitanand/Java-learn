import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 29-07-2017.
 */
public class lowes_2 {
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        long number_of_cases = Long.parseLong(obj.readLine());
        int m=0;
        for(int i=0;i<number_of_cases;i++) {
            String s[] = obj.readLine().split(" ");

            for (int j = 0; j <= Long.parseLong(s[0]); j++) {


                String n = Long.toString(Long.parseLong(Long.toString(j), 10), Integer.parseInt(s[1]));
                m=m+n.length();
            }
        System.out.println(m);
            m=0;
        }
    }
}
