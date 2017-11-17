/**
 * Created by Alpit on 26-07-2017.
 */
public class seq {
    public static void main(String args[]) {
 pattern(16);
    }

    private static void pattern(int i) {
        if(i==0||i<0){

            System.out.println(i+"//");
            return;
        }
    System.out.println(i+"**");
        for (int j=0;j<2;j++) {
            pattern(i - 5);
        }
        System.out.println(i);

    }
}
