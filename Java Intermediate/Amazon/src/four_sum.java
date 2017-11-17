import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 13-07-2017.
 */
public class four_sum {
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int y=Integer.parseInt(obj.readLine());
        System.out.println("Enter the number of array element");
        int a=Integer.parseInt(obj.readLine());
        int b[]=new int[a];
        int c=0;
        for(int j=0;j<a;j++){
            b[j]=Integer.parseInt(obj.readLine());
        }
        for(int q=0;q<a;q++){
            for(int w=0;w<a;w++){
                for(int t=0;t<a;t++){
                    for(int r=0;r<a;r++){
                        if((b[q]+b[w]+b[t]+b[r]==y)&&(b[q]!=b[w])&&(b[w]!=b[t])&&(b[t]!=b[r])){
                           c=1;
                            System.out.println(b[q]+" "+b[w]+" "+b[t]+" "+b[r]);
                            break;
                        }

                    }
                    if(c==1){
                        break;
                    }
                }
                if(c==1){
                    break;
                }
            }
            if(c==1){
                break;
            }
        }
    }
}
