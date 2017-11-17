import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 20-07-2016.
 Navi got a task at school to collect N stones. Each day he can collect only one stone. As N can be a very large number so it could take many days to complete the task, but then he remembers that his mother gave him a magic that can double anything (i.e if he has 2 stones, the magic will make them to 4 stones). Navi can use this magic any number of time on the collected stone on a particular day and add this to the previously collected stones. Remember that he wants exactly N stones and he can't throw any stone. If he gets more than N stones then he gets 0 marks, of course he doesn't want 0 marks. Help him to collect exactly N stones in minimum number of days.
 Input

 First line of input will contain number of test cases (T). Then next T lines contains a single number N, which is number of stones Navi has to collect.
 Output

 For each test case, Print a single number which is the minimum number of days taken by Navi to complete the task.
 */
public class TheMagic {
    public static void main(String args[]) throws IOException {
        int count=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int b = Integer.parseInt(obj.readLine());
        for (int j = 0; j < b; j++) {
            int z = Integer.parseInt(obj.readLine());
            arr.add(z);
        }
        for (int j = 0; j < b; j++) {
            int k =arr.get(j);
        while(k!=0)
        {

          k= k&(k-1);
    count++;

        }
        System.out.println(count);
        count=0;
        }

    }
}