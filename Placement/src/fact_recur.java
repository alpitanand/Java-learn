/**
 * Created by Alpit on 08-09-2017.
 */
public class fact_recur {
    public static void main(String arg[]){
        int a=5;
        int c = recur(a);
        System.out.println(c);
    }

    private static int recur(int i) {
        if(i==1){
            return i;
        }
        else {
            return i*recur(i-1);
        }
    }
}
