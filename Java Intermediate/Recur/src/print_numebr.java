/**
 * Created by Alpit on 27-07-2017.
 */
public class print_numebr {
    public static void main(String args[]){
        int b=1000;
    print_all(b);
    }

    private static void print_all(int b) {
        if(b==1){
            System.out.println(b);
            return;
        }

        print_all(b-1);
        System.out.println(b);
    }

}
