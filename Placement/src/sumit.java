import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * Created by Alpit on 06-09-2017.
 */
public class sumit {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        for (int i = 0; i < a; i++) {
            int m;
            int count=0;
            String s = obj.readLine();
            int l = s.length();

            for (int j = 0; j < l-1; j++) {
                char ch = s.charAt(j);
                char ch1 = s.charAt(j + 1);
                m=(int)ch-(int)ch1;
                if(m==1||m==-1||m==25||m==-25){
                    count=1;
                }
            else {
                    System.out.println("NO");
                    count=0;
                    break;
                }

            }
            if(count==1){
                System.out.println("YES");
            }

        }
    }
}

