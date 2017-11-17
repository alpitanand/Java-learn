/**
 * Created by Alpit on 17-06-2017.
 */
public class wrap {
    public static void main(String args[])
    {
        Integer i=1;
        int j=1;
        Integer k=new Integer(1);
        System.out.println(i+" "+j+" "+k);
        System.out.println(i==j);
        System.out.println(i==k.intValue());
        System.out.println(j==k);
        System.out.println(i+j+k);

    }
}
