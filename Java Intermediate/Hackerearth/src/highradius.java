import java.io.IOException;

/**
 * Created by Alpit on 17-03-2017.
 */
public class highradius {
    public int a,b;

    public highradius(int c,int d)
    {
        a=c;
        b=d;
    }
    public void radius()
    {
        System.out.println(a+b);
    }
}

class smallradius extends highradius{
public int we;
    smallradius(int k,int j,int l)
    {
        super(k,j);

        we=l;


    }
    public void radius()
    {
        System.out.println("From lower radius"+a*b*we);
        System.out.println("From lower radius"+a*b+"anjan");
    }
}

class interViewCall{
    public static void main(String args[])throws IOException
    {

        smallradius s= new smallradius(10,20,4);
        s.radius();
        highradius t= new smallradius(10,30,4);
        t.radius();


    }
}
