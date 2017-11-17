import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 08-07-2016.
 */
public class Pallindrome {
    public static void main(String args[])throws IOException
    {
        char ch;
        String b="";
        int i=0;
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);



        String s= in.readLine();

        for(i=s.length()-1;i>=0;i--) {
            ch=s.charAt(i);
            b=b+ch;
        }
if(s.equals(b))
{
    System.out.println("YES");
}
    else
{
    System.out.println("NO");
}
    }
}
