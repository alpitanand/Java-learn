import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 12-08-2017.
 */
public class Mana_name {
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        //int a = Integer.parseInt(obj.readLine());
        int count=0;

         String s = obj.readLine();
        if(s.contains("SUVO")){
             System.out.println("YES");
         }
         for (int i=0;i<s.length();i++){
            if(i+4>s.length()){
                break;
            }
            String k = (String) s.subSequence(i,i+4);
            if(k.equals("SUVO")){
                count++;
            }
         }
    System.out.println(count);
    }
    }

