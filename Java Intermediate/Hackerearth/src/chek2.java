import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

/**
 * Created by Alpit on 10/18/2016.
 */
public class chek2 {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int k=0,m=0,z=0;
        System.out.println("Enter a string");
        int a=Integer.parseInt(obj.readLine());
        String s = obj.readLine();
        String[] words = s.split(" ");
        ArrayList<Integer> b = new ArrayList<>();
        for (int j = 0; j < words.length; j++) {
            b.add(Integer.parseInt(words[j]));
        }

        for(int j=0;j<a;j=j+3)
        {

            if((j)>=a) {
                break;
            }
            k= k+b.get(j);

        }
        for(int j=1;j<a;j=j+3)
        {

            if((j)>=a) {
                break;
            }
            m= m+b.get(j);

        }
        for(int j=2;j<a;j=j+3)
        {

            if((j)>=a) {
                break;
            }
            z= z+b.get(j);

        }
    System.out.println(k+" "+m+" "+z);
    }
}
