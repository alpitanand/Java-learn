/**
 * Created by Alpit on 27-07-2017.
 */
public class catlan {
    public static void main(String args[]){
        int a =10;
      int b=  catlan_number(a);
      System.out.println(b);
    }

    private static int catlan_number(int a) {
        int res=0;
        if(a<=1){
            return 1;
        }
        for(int i=0;i<a;i++){
            res+=catlan_number(i)*catlan_number(a-i-1);
        }
        return res;
    }
}
