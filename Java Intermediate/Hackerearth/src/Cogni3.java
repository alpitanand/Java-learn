import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;
class Cogni_alpit
{
    public static void main(String args[])throws IOException
    {
        int x=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String s =obj.readLine();
        String s1[]=s.split(" ");
        int j=Integer.parseInt(s1[0]);
        String s2=obj.readLine();
        String s3[]=s2.split(" "); //stored s3

        for(int i=0;i<j;i++){
            int k=checkprime(s3[i]);
            x=x+k;
        }
        System.out.println(x-((Integer.parseInt(s1[1]))/(s2.length()*s2.length())));

    }

    private static int checkprime(String s) {
        int count=0;
        int r=0;
        double k=  ((Integer.parseInt(s)%(Math.pow(10,5)))+1);
        for(int i=2;i<k/2;i++){
            if(k%i==0){
                count++;
                break;
            }
        }
    if(count>0){
            r=1;
    }
    else {
        r=0;
    }
    return r;
    }
}
