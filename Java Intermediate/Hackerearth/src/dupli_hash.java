import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Alpit on 08-05-2017.
 */
public class dupli_hash {
    public static void main(String args[])throws IOException
    {

        BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
        String a=ob.readLine();
        String t[]=a.split("");
        HashSet<String> ab= new HashSet<>();
        for(int i=0;i<t.length;i++)
        {

            if(!ab.add(t[i]))
            {
                System.out.println("The duplicate elements are "+t[i]);
            }
        }

        for (String s : ab) {
            System.out.println(s);
        }

        Iterator it=ab.iterator();

        System.out.println("Now the o/p from iterator");
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }


}
