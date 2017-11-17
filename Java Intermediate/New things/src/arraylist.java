import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Alpit on 17-03-2017.
 */
public class arraylist {
    int roll;
    String name;
    int age;
    arraylist(int roll,String name,int age)
    {
        this.age=age;
        this.roll=roll;
        this.name=name;
    }
}

 class studata{
   public static void main(String args[])throws IOException
    {
        arraylist t1= new arraylist(121,"alpit1",12);
        arraylist t2= new arraylist(112,"alpit2",12);
        arraylist t3= new arraylist(121,"alpit3",12);
        ArrayList<Object> arr= new ArrayList<>();
        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
        Iterator i= arr.iterator();
        while (i.hasNext())
        {
            arraylist st= (arraylist) i.next();
            System.out.println(st.age+" "+st.name+" "+st.roll);
        }

    }
 }
