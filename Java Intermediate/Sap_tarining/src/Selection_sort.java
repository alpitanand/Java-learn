import java.io.IOException;

/**
 * Created by Alpit on 22-07-2017.
 */
public class Selection_sort {
    public static void main(String args[])throws IOException{
        int a[] = {1, 12, 2, 3, 4, 4, 5, 34, 34};
   int b[]= section(a);
   for(int j:b){
       System.out.println(j);
   }
    }

    private static int[] section(int[] a) {

        for(int i=0;i<a.length;i++){

            int min_index = i;
            for(int j=i+1;j<a.length;j++){
                    if(a[j]<a[min_index]){
                        min_index=j;
                    }
            }
            int temp=a[min_index];
            a[min_index]=a[i];
            a[i]=temp;

        }
    return a;
    }
}
