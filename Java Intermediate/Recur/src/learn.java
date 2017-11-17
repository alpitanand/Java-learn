/**
 * Created by Alpit on 16-06-2017.
 */
public class learn {
    public static void main(String args[]) {
        learn m = new learn();
     int a=   m.recurse(5);
     System.out.println(a);
    }

    private int recurse(int count) {

        if (count <= 0) {
           return 99999;
        } else {
            System.out.println(count);
          int c=  recurse(count-1);
          System.out.println("After c "+c);
        }
    return 10000000;
    }
}