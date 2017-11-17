/**
 * Created by Alpit on 11-05-2017.
 */
public class alfa {
    void get()
    {
        System.out.println("alfa");
    }
}
class beta extends alfa
{
    void get()
    {
        super.get();
        System.out.println("beta");

    }
}
class gamma extends beta
{
    void get()
    {
        super.get();
        System.out.println("gamaa");
    }
public static void main(String args[])
{
    alfa g= new gamma();
    beta b= new gamma();
    g.get();
    b.get();
    gamma=get2();


}
    public static gamma gamma;

    public static gamma get2()
    {
        System.out.println("print");
        gamma= new gamma();
        return gamma;
    }


}
