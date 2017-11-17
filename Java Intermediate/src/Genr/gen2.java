package Genr;

/**
 * Created by Alpit on 05-12-2016.
 */
public class gen2 {
public static void main(String args[]){
    twogen<String,Integer> two = new twogen< >( "Alpit",20);
    two.showtypes();
    int v= two.getOb2();
    System.out.println("Value "+ v);
    String b = two.getOb1();
    System.out.println("Value "+ b);


}

    /**
     * Created by Alpit on 05-12-2016.
     */
    public static class twogen<T,V> {
        T ob1;
        V ob2;

        public twogen(T ob1, V ob2) {
            this.ob2 = ob2;
            this.ob1 = ob1;
        }
    void showtypes(){
        System.out.println("The show types"+
        ob1.getClass().getName());
        System.out.println("The show types"+
                ob2.getClass().getName());

    }
    T getOb1()
        {
            return ob1;
        }
    V getOb2( )
    {
        return ob2;
    }
    }
}
