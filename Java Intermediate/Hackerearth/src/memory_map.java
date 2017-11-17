import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Alpit on 13-05-2017.
 */
public class memory_map {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String a= obj.readLine();
        String b[]=a.split(" ");
        HashMap<String,String> hashMap= new HashMap<>();
        for(int i=0;i<Integer.valueOf(b[0]);i++)
        {
            String m=obj.readLine();
            String re[]=m.split(" ");

            for(int j=0;j<re.length;j++)
            {


                hashMap.put(re[j],(Integer.toString(i)+" "+Integer.toString(j)));
            }
        }
    int k= Integer.parseInt(obj.readLine());
        for(int l=0;l<k;l++)
        {
            String hj=obj.readLine();
            if(hashMap.containsKey(hj))
            {
                System.out.println(hashMap.get(hj));
            }
            else {
                System.out.println("-1 -1");
            }

        }
    }
}
