import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Alpit on 17-03-2017.
 */
public class Linkedlist {
public static void main(String args[])throws IOException
{
    BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
    LinkedList<Object> l= new LinkedList<>();
    System.out.println("Enter name age roll");
    for(int j=0;j<3;j++) {
        int a = Integer.parseInt(obj.readLine());
        int b = Integer.parseInt(obj.readLine());
        String s = obj.readLine();
        arraylist t= new arraylist(a,s,b);
        l.add(t);
    }

    System.out.println("Enter your name");
    String r= obj.readLine();

    Iterator<Object> i= l.iterator();
    while (i.hasNext())
    {
        arraylist a= (arraylist) i.next();
        System.out.println(a.age+" "+" "+a.roll+" "+" "+a.name);
        if(a.name.equals(r))
        {
            System.out.println("Found");
        }
        else {
            System.out.println("not Found");
        }

    }


System.out.println(l.size());
}

}

