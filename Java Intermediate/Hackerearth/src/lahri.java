import java.io.IOException;

/**
 * Created by Alpit on 17-09-2016.
 */
public class lahri{
    public  void bar()
    {
        System.out.print("Lahiri barks");
    }
}

 class jaiswal extends lahri{
    public void bark()
    {
System.out.print("Jaiswal barks");
    }
}

class animal{

    public static void main(String args[])//throws IOException
    {
        jaiswal a= (jaiswal) new lahri();
        a.bark();
        a.bar();

    }

}
