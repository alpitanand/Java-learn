/**
 * Created by Alpit on 01-07-2017.
 */
public class Insertion_sort {
    public static void main(String args[])
    {
        int a[] = {9,14,3,2,43,11,58,22};
        System.out.println("Before insertion sort");
        for(int i : a)
        {
            System.out.print(i +" ");
        }
        insertion_sort(a);
        System.out.println("After insertion sort");
        for (int i: a)
        {
            System.out.print(i + " ");
        }
    }

    private static void insertion_sort(int[] a) {
        int n = a.length;
        for (int j =1;j<n;j++)
        {
            int key = a[j];
            int i =j-1;
            while((i>-1) && (a[i]>key))
            {
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
    }

}
