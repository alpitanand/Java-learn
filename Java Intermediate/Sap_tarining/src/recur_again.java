/**
 * Created by Alpit on 08-07-2017.
 */
public class recur_again {
    public void pr(int i) {
        if (i > 0) {
            System.out.println(i);
            pr(i - 1);
            System.out.println(i);
        }

    }
public static void  main(String args[]){
        recur_again r= new recur_again();
        r.pr(5);
}
}
