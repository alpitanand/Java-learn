import java.io.IOException;

/**
 * Created by Alpit on 14-03-2017.
 */
public class hie extends bye      {
    hie(int i,int j,int k)
    {
    super(i,j);
         k=5;
        System.out.println(i*j*k);
    }

    public static void main(String args[])throws IOException
    {
        System.out.println("hie");

        hie b1= new hie(5,5,5);
        bye b2= new bye(10,20);

        b1.say1();
        b2.say();
        System.out.println(b2.i*b2.j);
    }
    public void sayt()
    {
        System.out.println("Say*");
    }
    public void say1()
    {
        System.out.println("*Say*");

    }




}
