import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Alpit on 24-08-2017.
 */
public class directi2 {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i=0;i<a;i++){
            String s = obj.readLine();
            String w = obj.readLine();
            String m[] = s.split("");
            String j[] = w.split("");
            arrayList.addAll(Arrays.asList(m));
            for(int t=0;t<arrayList.size();t++){

            }
        }
    }
}
