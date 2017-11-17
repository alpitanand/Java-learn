/**
 * Created by Alpit on 26-07-2017.
 */
public class pallin {
    static int t=0;
    public static void main(String args[]){
        int a=121323;
        int b=a;
        recur(a,b);
    }

    private static void recur(int a, int b) {

        if(a==0){
            System.out.println(t);
            return;
        }
        int x=a%10;
        t=(t*10)+x;
        a=a/10;
        recur(a,b);
    }
}
