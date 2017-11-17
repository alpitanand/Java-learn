import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Alpit on 22-10-2017.
 */
public class binary {
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int a = Integer.parseInt(obj.readLine());
        int b[] = {1,2,45,2,4,6};
        Arrays.sort(b);
        int mid = 0,high,low=0;
        int l = b.length;
        high=l-1;
        int c=0;
        for(int i=0;i<l;i++){
            mid = (high+low)/2;

            if(b[mid]==a){
                c=1;
                System.out.println("Number found");
                break;
            }
            else if(b[mid]>a){
                high = mid-1;
            }
            else if(b[mid]<a){
                low = mid+1;
            }
        }
        if(c==0){
            System.out.println("NUmber not found");
        }


    }
}
