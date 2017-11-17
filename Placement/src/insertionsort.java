/**
 * Created by Alpit on 03-09-2017.
 */
public class insertionsort {
    public static void main(String args[]){
        int a[] = {1,3,4,2,4,5,2,4,5,3,5};
        for(int i:a){
            System.out.print(i+" ");
        }
        insertion(a);
        System.out.println(" ");
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    private static void insertion(int[] a) {
       int j = a.length;
       for(int i=1;i<j;i++){
           int key = a[i];
           int m=i-1;
           while (m>=0 && key<a[m]){
               a[m+1] = a[m];
               m=m-1;
           }
           a[m+1]=key;
       }
    }
}
