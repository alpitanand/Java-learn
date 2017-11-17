import java.io.IOException;

/**
 * Created by Alpit on 13-08-2017.
 */
public class selection_sort {
    public static void main(String args[])throws IOException{
        int a[] = {1,2,4,3,2,4,24};
        int b=a.length;
        int min;
        int temp;
        for(int i=0;i<b-1;i++){

            min = i;
            for(int j=i+1;j<b;j++){
                if(a[j]<a[i]){
                    min=j;
                }
            }

        temp = a[min];
        a[min] =a[i];
        a[i] = temp;
        }
        for(int k:a){
            System.out.println(k);
        }
    }
}
