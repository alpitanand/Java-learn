/**
 * Created by Alpit on 25-09-2017.
 */
public class backtracking {
    public static void main(String args[]){
        char A[]= {'a','b','c'};
        binary(A.length,A);
    }

    private static void binary(int i, char t[]) {
        if(i<1){
            System.out.println(t[i]);
        }
        else {
            t[i-1]=0;
            binary(i-1,t);
            t[i-1]=1;
            binary(i-1,t);
        }
    }
}
