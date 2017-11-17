import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Alpit on 11-06-2017.
 */
public class Pg55 {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String s1 = obj.readLine();
        String s2 = obj.readLine();
        String a1[] = s1.split(s2);
        ArrayList<String> arrayList= new ArrayList<>();
        for(String c:a1)
        {
            if(!Objects.equals(c,""))
            {
                arrayList.add(c);
            }
        }
String a[]=arrayList.toArray(new String[arrayList.size()]);
        int b = s1.lastIndexOf(s2);
        int m = s1.indexOf(s2);
        if (b == m) {
            if (b == 0) {

                System.out.print(a[0].charAt(0));
            } else if (b > 0 && a.length == 1) {
                System.out.println(a[0].charAt(s1.length() - s2.length() - 1));
            } else {

                System.out.print(a[0].charAt(a[0].length() - 1));
                System.out.print(a[1].charAt(0));

            }
        }
        if(b!=m)
        {
           if(a.length==1)
           {
               System.out.print(a[0].charAt(0));
               System.out.print(a[0].charAt(a[0].length()-1));
           }
           else if(a.length>1)
           {
               for(int i=0;i<a.length;i++)
               {
                   if(i==0)
                   {
                       System.out.print(a[i].charAt(a[i].length()-1));
                   }
                   else if(i>0&&i<a.length-1)
                   {
                       System.out.print(a[i].charAt(0));
                       System.out.print(a[i].charAt(a[i].length()-1));
                   }
                   else if(s1.endsWith(s2))
                   {
                       System.out.print(a[i].charAt(0));
                       System.out.print(a[i].charAt(a[i].length()-1));
                   }

                   else {

                       System.out.print(a[i].charAt(0));
                   }
               }
           }
        }

    }
}
