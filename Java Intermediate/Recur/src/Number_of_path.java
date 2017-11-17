import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 26-07-2017.
 */
public class Number_of_path {
    public static void main(String args[]){
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a= 3;
        int b =3;
      int c= path(a,b);
      System.out.println(c);
    }

    private static int path(int a, int b) {
        if(a==1||b==1){
            return 1;
        }
        else {
            return path(a-1,b)+path(a,b-1)+path(a-1,b-1);
        }
    }

}
