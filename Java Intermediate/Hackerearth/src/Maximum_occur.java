import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Alpit on 10-05-2017.
 */
public class Maximum_occur {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj= new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter the string to be checked");
        String  s= obj.readLine();
        String arr[]=s.split("");
       ArrayList<String> arrayList= new ArrayList<>();
        HashMap<String,Integer> hashMap= new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            //This line is used  to check wether the MAP contains the key or not and if its does
            //number of occurrences is been noted

            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            } else {
                hashMap.put(arr[i],1);
            }
        }
        for(Map.Entry<String,Integer> entry:hashMap.entrySet())
        {
            if(Objects.equals(entry.getValue(), Collections.max(hashMap.values()))) {

            arrayList.add(entry.getKey());

            }
            }
    String y=Collections.min(arrayList);
        System.out.println(y+" "+hashMap.get(y));
    }
    }

