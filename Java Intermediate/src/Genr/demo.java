package Genr;

/** new class **/
public class demo
{
    public static void main(String args[])
    {
        Genri<Integer> iob;
    iob= new Genri<>(90);
    iob.showttype();
    int v = iob.getOb();
        System.out.println(v);

    Genri<String> st;
        st= new Genri<String>("Alpit is a great guy");

    String s= st.getOb();
        System.out.println(s);
    }

    /**
     * Created by Alpit on 03-12-2016.
     */
    public static class Genri<T> {

        T ob;
        Genri(T o)
        {
            ob=o;
        }
    T getOb()
    {
        return ob;
    }
    void showttype()
    {
        System.out.println("The type of valur of t"+ob.getClass().getName());
    }
    }
}
