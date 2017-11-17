import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Alpit on 13-05-2017.
 */
public class omar {

    public static void main(String args[]) throws IOException {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());

        for (int i = 0; i < a; i++) {
            String s = obj.readLine();
            op(s);
        }
    }

    private static void op(String s) {

        HashMap<String, Integer> hashmap = new HashMap<>();
        String arr[] = s.split("");
        for(String a:arr)
        {
            if(hashmap.containsKey(a))
            {
                hashmap.put(a,hashmap.get(a)+1);
            }
            else {
                hashmap.put(a,1);
            }
        }

        for (int i = 122; i >= 97; i--) {
            char ch = (char) i;
            String m = Character.toString(ch);
            if(!hashmap.containsKey(m))
            {
                hashmap.put(m,0);
            }
        }
    for(Map.Entry e:hashmap.entrySet())
    {
        System.out.println(e.getKey()+" "+e.getValue());
    }

    }
}