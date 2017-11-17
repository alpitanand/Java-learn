import java.io.IOException;

/**
 * Created by Alpit on 11-05-2017.
 */
public class Solution {
    public static void main(String args[]) throws IOException {

hmmm b= new hmmm();
        b.compute(5);
        b.print();
    }
}
class hmmm{
    int a=100;
    void compute(int a)
    {
        this.a=a*100;

    }
    void print()
    {
        System.out.println(a);
    }

}

