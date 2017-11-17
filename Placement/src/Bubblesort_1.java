/**
 * Created by Alpit on 08-09-2017.
 */
@SuppressWarnings("Duplicates")
public class Bubblesort_1 {
    public static void main(String args[]){
        int a[] = {11,12,13,5,6};

      int b[]=bubblesort(a);
      int z[]=selec_sort(a);
      int j[]=insertion_sort(a);

        for(int i:j){
            System.out.println(i+" ");
        }
    }

    private static int[] insertion_sort(int[] a) {
        int n= a.length;
        for(int i=1;i<n;i++){
            int key = a[i];
            int j=i-1;
            while (j>=0&&a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
return a;
    }

    private static int[] selec_sort(int[] a) {
        int index;
        int temp;
        for(int m=0;m<a.length;m++){
            index=m;
            for(int h=m;h<a.length;h++){
                if(a[h]<a[m]){
                    index=h;
                }
            }
        temp = a[m];
        a[m]= a[index];
        a[index] = temp;
        }
        return a;
    }

    private static int[] bubblesort(int[] a) {
        int c = a.length;
        int temp;
        for(int i=0;i<c;i++){
            for(int k=0;k<c-1;k++) {
                if (a[k] > a[k + 1]) {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }
            }
        }
        return a;
    }
}
