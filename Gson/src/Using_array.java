import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alpit on 14-05-2017.
 */
public class Using_array {


    String naame;
    List<Menu1> item2;


    public Using_array(String naame, List<Menu1> item3) {
        this.naame = naame;
        this.item2 = item3;
    }
}
class Menu1{
    String dish;
    int price;

    public Menu1(String dish, int price) {
        this.dish = dish;
        this.price = price;
    }

}
class text
{
    public static void main(String args[])
    {
        List<Menu1> item= new ArrayList<>();
        item.add(new Menu1("Alpir",23));
        item.add(new Menu1("Alpir",23));
        item.add(new Menu1("Alpir",23));
        item.add(new Menu1("Alpir",23));
        item.add(new Menu1("Alpir",23));
        item.add(new Menu1("Alpir",23));
        item.add(new Menu1("Alpir",23));
        Using_array using_array= new Using_array("ALpitdaba",item);
        Gson gson = new Gson();
        String tr= gson.toJson(using_array);
        System.out.println(tr);

    }

}
