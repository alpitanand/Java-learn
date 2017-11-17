import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 13-07-2017.
 */
public class two_three {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(obj.readLine());


        for (int i=0;i<a;i++){
            int arr_len = Integer.parseInt(obj.readLine());
            int arr[]=new int[arr_len];
            for(int j=0;j<arr_len;j++){
                arr[j]=Integer.parseInt(obj.readLine());
            }
            check(arr);
        }
    }

    private static void check(int[] arr) {
        int c=0;
        int m=0;
        int u=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]%3==2){
                c++;
            }
            if(arr[k]%3==1){
                u++;
            }
            if(arr[k]%3==0){
                m++;
            }
        }
        int r=(c*u)+((m*(m-1))/2); //Divisible by 2
        int y=((c*(c-1)*(c-2))/6)+((u*(u-1)*(u-2))/6)+((m*(m-1)*(m-2))/6);
        int j=c*u*m;
        System.out.println(j+r+y);



    }
}
