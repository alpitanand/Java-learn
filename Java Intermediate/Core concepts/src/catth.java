import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 16-06-2017.
 */
public class catth {
    public static void main(String args[]) {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];
        try {
            for (int i = 0; i < 6; i++) {
                a[i] = Integer.parseInt(obj.readLine());
            }
        }
        catch (IOException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}