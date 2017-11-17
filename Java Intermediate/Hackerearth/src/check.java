import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 10/17/2016.
 */
public class check {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a;
        String s;
        int count=0;
        System.out.println("Enter the no");
        s=obj.readLine();
        a= s.length();
        int c=1;
        if(s.charAt(0)==(Integer.toString(c).charAt(0)))
        {
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
