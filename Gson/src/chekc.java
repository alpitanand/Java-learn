import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 14-05-2017.
 */
public class chekc {
String name;
    int age;
    String add;
    int phone;

    public chekc(String name, int phone, String add, int age) {
        this.name = name;
        this.phone = phone;
        this.add = add;
        this.age = age;
    }
}

class alpit {
    public static void main(String args[])throws IOException
    {
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        chekc c = new chekc("alpit", 977826, "KP-5a", 21);
        Gson g = new Gson();
        String user = g.toJson(c);
     System.out.println(user);
        System.out.print(g.fromJson(user,chekc.class));
String s="älpit";

    }
}
