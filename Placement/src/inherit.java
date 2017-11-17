/**
 * Created by Alpit on 08-09-2017.
 */
public class inherit {
    void eat(){
        System.out.println("I am eating");
    }
    void drink(){
        System.out.println("I am drinking");
    }
}
class alpit extends inherit{
    public static void main(String args[]){
        inherit inherit= new inherit();
        inherit inherit1= new alpit();
        alpit alpit= new alpit();
inherit.eat();
inherit.drink();
inherit1.eat();
inherit1.drink();
alpit.eat();
alpit.drink();

    }
    void eat(){
        System.out.println("I am eating puff");
    }
    void drink(){
        System.out.println("I am drinking water");
    }
}