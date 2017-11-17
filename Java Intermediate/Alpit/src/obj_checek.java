import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alpit on 25-05-2017.
 */
public class obj_checek {
    static check e;
    public static void main(String args[])throws IOException
    {

       ArrayList<Object> a= new ArrayList<>();
        check c= new check(10);
        System.out.println(c.alpit+" "+c.prachee);
        c.alpit= new check(50);
c.prachee= new check(12);
        System.out.println(c.alpit);
        c.a= new check(1);
for(int i=0;i<10;i++)
{
     e= new check(i);
    a.add(e);


}

    }
}
class check{
    check prachee;
    check alpit;
    //check i =new check(12);
    check a;
    int b;
    int v;
     public check(int j)
     {
        v=j;
     }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}

