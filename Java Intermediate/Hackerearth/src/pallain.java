import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 13-05-2017.
 */
public class pallain {
    public static void main(String args[])throws IOException
    {
        BufferedReader o= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter a paragraph");
        String s=o.readLine();
        String t[]=s.split(" ");
        for(String m:t)
        {
            pallindrome(m);
            System.out.println(m);
        }
    }

    private static void pallindrome(String m) {
        String y="";
        int a=m.length();
        for (int i=a-1;i>=0;i--)
        {
            char ch=m.charAt(i);
            y=y+ch;
        }
        System.out.println(y);
        if(y.equals(m))
        {
            System.out.println(m+" is pallin");
        }

    }


}
