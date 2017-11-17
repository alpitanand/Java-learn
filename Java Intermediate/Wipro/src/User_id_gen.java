import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Alpit on 28-06-2017.
 */
public class User_id_gen {
    public static void main(String args[])throws IOException
    {
        String long_name;
        String short_name;
        String fin= "";
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str= new ArrayList<>();
        System.out.println("Enter the first name");
        String first = obj.readLine();
        System.out.println("Enter the last name");
        String last = obj.readLine();
        System.out.println("Enter pin code");
        int p = Integer.parseInt(obj.readLine());
        String pin =Integer.toString(p);
        System.out.println("Enter a number n");
        int n = Integer.parseInt(obj.readLine());
        if(first.length()>last.length())
        {
            long_name=first;
            short_name=last;
        }
        else {
            short_name =first;
            long_name=last;
        }
        if(first.length()==last.length())
        {
            str.add(first);
            str.add(last);
            Collections.sort(str);
            short_name=str.get(0);
            long_name=str.get(1);
        }

        String id = short_name.charAt(0)+long_name+pin.charAt(n-1)+pin.charAt(pin.length()-n);
        for (int i=0;i<id.length();i++)
        {
           char ch=id.charAt(i);
           if(Character.isLetter(ch) && Character.isLowerCase(ch))
           {
               fin =fin + Character.toUpperCase(ch);

           }
           else if(Character.isLetter(ch) && Character.isUpperCase(ch))
           {
               fin = fin + Character.toLowerCase(ch);
           }
           else {
               fin = fin + ch;
           }
        }
        System.out.println(fin);
    }
}
