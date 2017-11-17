import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 05-09-2017.
 */
public class array_rotation {
    public static void main(String args[])throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 22, 33, 44, 55, 66, 77, 88};
        int b = a.length;
        System.out.println("Enter the array rotation");
        int c = Integer.parseInt(obj.readLine());
        for(int i=0;i<c;i++){
           a = rotate_once(a,b);
        }
        for(int p:a){
            System.out.println(p);
        }
    }

    private static int[] rotate_once(int v[],int z) {

       int temp = v[z-1];
        for(int m=z-1;m>0;m--){

            v[m]= v[m-1];
        }
        v[0] = temp;
    return v;
    }
}
