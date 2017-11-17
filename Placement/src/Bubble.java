/**
 * Created by Alpit on 03-09-2017.
 */
public class Bubble {
    public static void main(String args[]){
        int a[] = {1,4,5,2,3,4,5,5,3,2,1};
        for(int i:a){
            System.out.print(i+" ");
        }
       int b[] = Bubblesort(a);
        System.out.println();
        for(int i:b){
            System.out.print(i+" ");
        }
    }

    private static int[] Bubblesort(int[] a) {
        int j = a.length;
        for(int l=0;l<j;l++)
        {
            for(int k=0;k<j-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    int temp = a[k];
                    a[k]= a[k+1];
                    a[k+1] = temp;
                }
            }
    }


return a;
    }
}
