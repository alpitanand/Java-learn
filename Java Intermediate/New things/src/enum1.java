import java.io.IOException;

/**
 * Created by Alpit on 14-06-2017.
 */
public class enum1 {
    public static void main(String args[]) throws IOException {
        Day today;
        today = Day.MON;
        System.out.println(today);
        int i=1,j=1;
        System.out.println(i++);
        System.out.println(++j);
        System.out.print(i);
    }

    public enum Day {MON, TUE, WED, THR, FRI, SAT, SUN}


}
