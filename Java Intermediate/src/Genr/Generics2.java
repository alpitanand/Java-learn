package Genr;

/**
 * Created by Alpit on 05-12-2016.
 */
public class Generics2 {
    public static void  main(String args[])
    {
        Generics<String> ab = new Generics<>("Alpit");
      String s=  ab.hi();
    System.out.println(s);
    }

    /**
     * Created by Alpit on 05-12-2016.
     */
    public static class Generics<T> {
        T ob;

        public Generics(T ob) {
            this.ob = ob;
        }
    T hi()
    {
        return ob;
    }
    }
}
