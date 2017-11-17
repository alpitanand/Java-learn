import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Alpit on 27-10-2016.
 */
public class oneD_queue {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        Queue<String> queu= new LinkedList<String>();
        int N = Integer.parseInt(obj.readLine());
        String s1=obj.readLine();
        String s2=obj.readLine();
        String f[]=s1.split(" ");
        String e[]=s2.split(" ");
        for(int i=0;i<f.length;i++)
        {
            queu.add(f[i]);
        }
        int j=0,k=0;
    while (!queu.isEmpty())
    {
        if(queu.peek().equals(e[j])) {
            queu.poll();
            j++;
            k++;
        }
            else
            {
                String g=queu.peek();
                queu.poll();
                queu.add(g);
                k++;
            }
        }
   System.out.println(k);
    }
    }

