import java.io.IOException;

/**
 * Created by Alpit on 08-06-2017.
 */
abstract public class Box2 {
    int height;
    int length;
    int breath;
    Box2()
    {
        height=-1;
        length=-1;
        breath=-1;
    }
    Box2(int a,int b,int c)
    {
        height=a;
        length=b;
        breath=c;
    }
    Box2(int len)
    {
        height=len;
        breath=len;
        length=len;
    }
    public void volume()
    {
        System.out.println(height*length*breath);
    }
    abstract void callme();
}
class BoxWeight extends Box2
{
    double weight;
    BoxWeight(int a,int b,int c,int d)
    {
//        height=a;
//        length=b;
//        breath=c;
        //Super can call constructor from super class
        super(a,b,c);
        weight=d;
    }

    @Override
    void callme() {
        System.out.println("From abstract");
    }
}

class Alpit
{
    public static void main(String args[])throws IOException
    {
        BoxWeight boxWeight= new BoxWeight(10,20,30,50);
        boxWeight.volume();
        boxWeight.callme();
    }
}
