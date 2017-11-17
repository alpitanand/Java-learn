import java.io.IOException;

/**
 * Created by Alpit on 25-09-2017.
 */
public class check_sort {
public static void main(String args[])throws IOException{
    int a[]= {1, 2, 3, 4, 5, 6, 7};
    int i=1;
   check(a, i);

}

    private static void check(int[] a, int j) {
    if(j==a.length){
        System.out.println("Sorted");
    }
    else if(a[j-1]<a[j]){
            j++;
            check(a,j);
        }
    }
}
