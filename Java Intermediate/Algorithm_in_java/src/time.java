import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

/**
 * Created by Alpit on 13-08-2017.
 */
public class time {
    public static void main(String args[]) throws IOException, ParseException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the time");
        String s = obj.readLine();
        String date[] = s.split(":");
        int t = checkDuplicate(date);
        if(t==1){
            System.out.print(s);
        }
        else {
            while (t==0){
                int k = Integer.parseInt(date[2]);
                if(k<59){
                    k++;
                }
                else if(k==59) {
                    k=0;
                    int y =Integer.parseInt(date[1]);
                    y++;
                }

            }
        }

    }

    private static int checkDuplicate(String[] date) {
        int l=0;
        HashSet<String> hashSet = new HashSet<>();
        int d =date.length;
        String m = "";
        for(int k=0;k<d;k++){
            m = m.concat(date[k]);
        }
        String c[] = m.split("");
        for(String k:c){
            if(hashSet.add(k)){
                l=1;
            }
            else {
                l=0;
                break;
            }
        }
    return l;
    }
}
