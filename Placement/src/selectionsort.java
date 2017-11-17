/**
 * Created by Alpit on 03-09-2017.
 */
public class selectionsort {
    public static void main(String args[]){
        int a[] = {1, 3, 4, 2, 2, 4, 2, 4, 1, 10, 4, 2, 4, 2, 4};
        for(int i:a){
            System.out.print(i+" ");
        }
        Selection(a);
        System.out.println(" ");
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    private static void Selection(int[] a) {
        int j = a.length;
        for(int i=0;i<j;i++){
            int min_index = i;
            for(int k=i+1;k<j;k++){
                if(a[min_index]<a[k]){
                    min_index = k;
                }

            }
            int temp = a[min_index];
            a[min_index]= a[i];
            a[i] = temp;
        }
    }
}
