import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args)
    {
        Scanner ab=new Scanner(System.in);
        int t=ab.nextInt();
        while(t-->0)
        {
            int count=0,i=1,j=1;
            int a=ab.nextInt();
            int b=ab.nextInt();
            //   System.out.println("");
            System.out.println(check(a,b,1,0));
        }
    }
    public static int check(int a,int b,double curr_no,double cur_sum)
    {
        int result=0;
        double p=Math.pow(curr_no,b);
        while(p+cur_sum<a)
        {
            result+=check(a,b,curr_no+1,p+cur_sum); // because every time result is 0
            curr_no++;//check with new no as the current scennario has been exeuted
            p=Math.pow(curr_no,b);

        }
        if(p+cur_sum==a)
            result++;
        return result;
    }
}

