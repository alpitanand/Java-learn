import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 08-07-2016.
 */
public class Upperlower {


    public static void main(String args[])throws IOException
    {
        char ch;
         int i=0;
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);



        String s= in.readLine();

        for(i=0;i<s.length();i++) {
           ch=s.charAt(i);
           if(ch>='A' && ch<='Z')
           {
               ch= (char)(ch+32);
               System.out.println(ch);
           }

        else if(ch>='a' && ch<='z')
           {
               ch= (char)(ch-32);
               System.out.println(ch);
           }
        }

    }
}
