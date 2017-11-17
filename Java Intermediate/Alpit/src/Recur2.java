/**
 * Created by Alpit on 17-07-2017.
 */
public class Recur2 {
    public static void main(String args[]){
        x(3);
    }

    private static void x(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("   "+n);
            x(n - 1);
        }
    }
}
