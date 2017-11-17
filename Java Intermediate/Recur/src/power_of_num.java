/**
 * Created by Alpit on 26-07-2017.
 */
public class power_of_num {
    public static void main(String args[]){
        int a=100;
        int b=2;
        int sum=0;
        int num=1;
        int k=check(a,b,0,1);
        System.out.println(k);
    }

    private static int check(int a, int b, double sum, double num) {
        int res=0;
        double p =Math.pow(num,b);
        while (p+sum<a){
            res+=check(a,b,sum+p,num+1);
            num++;
            p=Math.pow(num,b);
        }
        if(sum+p==a){
            res++;
        }
        return res;
    }
}
