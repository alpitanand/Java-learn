import java.io.UncheckedIOException;

/**
 * Created by Alpit on 18-06-2017.
 */
public class List<T> {
    private T[] datastore;
    private int size;
    private int pos;

    public List(int size) {
        this.size = size;
        pos=0;
        datastore=(T[])new Object[size];
    }
    public void add(T element)
    {
        datastore[pos]=element;
        pos++;
    }
    public String toString()
    {
        String element="";
        for(int i=0;i<datastore.length;i++)
        {
            element+=datastore[i]+" ";
        }
    return element;
    }
}
class Alpit {
    public static void main(String args[]) {
        List<String> a = new List<String>(2);
        a.add("ALpit");
        a.add("Prachee");
    }
}