import java.io.IOException;

/**
 * Created by Alpit on 08-06-2017.
 */
public class Box {
int height;
int length;
int width;
    public int volume()
    {
        return height*length*width;
    }
    public void setdimen(int a,int b,int c)
    {
        height=a;
        length=b;
        width=c;
    }
}

class Vol
{
    public static void main(String args[])throws IOException
    {
        Box box= new Box();
        box.width=10;
        box.length=10;
        box.height=10;
        System.out.println(box.volume());
        Box box1= new Box();
        box1.setdimen(10,20,30);
        System.out.println(box1.volume());

    }
    static {
        System.out.println("This is me");
    }
}
