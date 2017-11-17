/**
 * Created by Alpit on 29-11-2016.
 */
public class Add {
    public static void main(String args[])
    {
        int a=5;
        int b=6;

        System.out.println(a+" "+b);
        meth(a,b);
        System.out.println(a+" "+b);
    }

    private static void meth(int v, int d) {
        v=v+6;
        d=d+5;
    System.out.println(v);

        System.out.println(d);
    }
}
