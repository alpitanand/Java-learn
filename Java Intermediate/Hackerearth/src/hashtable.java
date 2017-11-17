import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Alpit on 03-05-2017.
 */
public class hashtable {
    public static void main(String args[])throws IOException
    {
        Hashtable<Integer,String> hash= new Hashtable<>();
        hash.put(100,"Alpit");
        hash.put(150,"Rishav");
        hash.put(102,"Prachee");
        System.out.println(hash);
        hash.remove(150);
        System.out.println(hash);
        hash.put(12121,"Yaayaa");
        hash.put(90,"Ya");
        Iterator it= hash.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry mp=(Map.Entry) it.next();
            System.out.println(mp.getKey()+"  "+mp.getValue());
        }
    }
}
