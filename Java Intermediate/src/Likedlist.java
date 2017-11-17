import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alpit on 29-11-2016.
 */
public class Likedlist {

public static void main(String args[])
{
String things []={"ALpit","anand","is","a","good","boy"};




    List<String> arry = new LinkedList<>();
    for(String x: things)
    {
        arry.add(x);
    }
    String things2 []={"Yes","he","is"};



    List<String> arry2 = new LinkedList<>();
    for(String x1: things2)
    {
        arry.add(x1);
    }

arry.addAll(arry2);
arry2=null;

removestuff(arry,2,5);
   //printme(arry);

    for (String b:arry
         ) {
        System.out.print(b);
    System.out.println();
    }
}

    private static void removestuff(List<String> arr, int i, int i1) {


arr.subList(i,i1).clear();

        for (String s:arr
                ) {
            System.out.print(s);
            System.out.println();
        }
   }

//    public static void printme(List<String> al)
//{
//    for (String b:al
//         ) {
//        System.out.print(b);
//    System.out.println();
//    }

}




