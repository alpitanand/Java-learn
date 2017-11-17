/**
 * Created by Alpit on 01-07-2017.
 */
public class inser_Sort_Self {
    public static void main(String args[])
    {
        int a[ ]={9,14,3,2,43,11,58,22};
       for (int i=1;i<a.length;i++)
       {
           int key = a[i];
           int j = i-1;
           while ((j>-1) && (a[j]>key))
           {
               a[j+1] = a[j];
               j--;
           }
           a[j+1]=key;
           System.out.println(key);
       }
    for (int i: a)
    {
        System.out.println(i);
    }
    }


}
