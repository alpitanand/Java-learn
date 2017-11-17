import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Alpit on 24-08-2017.
 */
public class Directi {
    public static void main(String args[]) throws IOException {
     //   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
       Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();


        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        HashSet<String> hashSet = new HashSet<String>();

        for (int i = 0; i < a; i++) {
            int count = 1;

            String s = sc.next();
            String w = sc.next();
            String k[] = s.split("");
            String k2[] = w.split("");
            for (String n : k2) {
                if (hashSet.add(n)) {
                    count++;
                }
            }
            if (count != k2.length) {
                count = 1;
            }
            for (String aK2 : k2) {
                for (String aK : k) {
                    if (aK2.equals(aK)) {
                        if (hashMap.containsKey(aK2)) {
                            hashMap.put(aK2, hashMap.get(aK2) + 1);
                        } else {
                            hashMap.put(aK2, 1);
                        }
                    }
                }

            }
//            for(HashMap.Entry<String,Integer> map:hashMap.entrySet()){
//                System.out.println(map.getKey()+"//"+map.getValue());
//            }
            int d = Collections.min(hashMap.values());
            if (hashSet.size() == 1 && w.length() == 1) {
                System.out.println(d);
            } else if (hashSet.size() == 1) {
                int r = d / count;
                System.out.println(r / 2);
            } else {
                System.out.println(d);
            }
            hashMap.clear();
            hashSet.clear();

        }
    sc.close();
    }


}
