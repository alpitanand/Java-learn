import java.util.*;
import java.lang.*;
import java.io.*;

class bleak {
    public static void main (String[] args)throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(obj.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<a;i++){
            int b= Integer.parseInt(obj.readLine());
            arr.add(b);
        }
        for(int k:arr){
            bleak(k);
        }

    }
    public static void bleak(int o){
        int p=0;
        for(int j=0;j<o;j++) {
            int x = j + bin(j);
            if (x == o) {
                p = 1;
                break;
            } else {
                p = 0;

            }
        }
    if(p==0){
            System.out.println(1);

    }
    else{
        System.out.println(0);
    }
    }
    public static int bin(int q){
        int count=0;
        while(q!=0){
            int t = q & 1;
            if(t==1){
                count++;
            }
            q=q>>1;
        }
        return count;
    }


}