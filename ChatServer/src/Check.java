import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Alpit on 28-11-2016.
 */
public class Check extends Register {

    static ArrayList<String> list;
    static ArrayList<String> list2;

    public static void pass(ArrayList<String> name, ArrayList<String> word) {
        list = name;
        list2 = word;

    }

    public static void confirm(String text, String text1) {

if(list.indexOf(text)==list2.indexOf(text1))
{
    System.out.print("Access granted");
}
    else
{
    System.out.print("Access not granted");
}
    }
}
