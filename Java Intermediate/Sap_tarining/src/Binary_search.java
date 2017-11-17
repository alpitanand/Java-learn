import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Alpit on 07-07-2017.
 */
public class Binary_search {
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a[] = {1,2,23,12,34,345,5624,25,2,10};
        System.out.println("Enter number to be searched");
        int b= Integer.parseInt(obj.readLine());
       int c[]=sort(a);
//        for(int i:c){
//            System.out.println(i);
//        }
   boolean found = bin_search(b,c);
   System.out.println(found);
    }

    private static boolean bin_search(int b, int[] c) {
        int a =0;
        int d=c.length-1;
        int mid;
        while (a<=d){
            mid = (a+d)/2;
            if(c[mid]==b){
               return true;
            }
        else if(b>c[mid]){
                a = mid+1;
            }
        else if(b<c[mid]){
                d=mid-1;
            }

        }
return false;
    }
    private static int[] sort(int[] a) {

       for(int i=1;i<a.length;i++){
           int key = a[i];
           int j = i-1;
           while ((j>-1)&&(key<a[j])){
               a[j+1]=a[j];
               j--;
           }
           a[j+1]=key;
       }


        return a;
    }
}
