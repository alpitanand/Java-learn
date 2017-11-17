import java.io.IOException;

/**
 * Created by Alpit on 08-06-2017.
 */
public class imp extends sup implements inter {
    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void travel() {
        System.out.println("Travel");
    }

    public static void main(String args[]) throws IOException {
        imp imp = new imp();
        imp.eat();
        imp.travel();
        System.out.println(alpit(10));

    }
}
