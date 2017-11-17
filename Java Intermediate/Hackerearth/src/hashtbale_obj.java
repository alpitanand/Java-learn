import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Alpit on 03-05-2017.
 */
public class hashtbale_obj {
    int age;
    String name;
    int height;

    hashtbale_obj(int age,String name,int height)
    {
        this.age=age;
        this.name=name;
        this.height=height;
    }


}

class alpit {


    public static void main(String arga[])throws IOException
    {
        int age = 0;
        int height=0;
        String name=" ";
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter age name height in same order");

        Hashtable<String,Object> det= new Hashtable<>();
        while(true)
        {
            System.out.println("Enter the age");
            try {
                age = Integer.parseInt(read.readLine());
            if(age==0)
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a valid number");

            }

            System.out.println("Enter the name");
            name=read.readLine();
            if(name.equals(""))
            break;
            System.out.println("Enter the height");
            height=Integer.parseInt(read.readLine());
            hashtbale_obj ob= new hashtbale_obj(age,name,height);
            det.put(name,ob);
        }
       for(Map.Entry<String,Object> m:det.entrySet())
       {
           System.out.println(m.getKey());
           hashtbale_obj a= (hashtbale_obj) m.getValue();
           System.out.println(a.age+" "+a.height+" "+a.height);
       }
    }
}
