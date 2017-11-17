/**
 * Created by Alpit on 10-07-2017.
 */
public class Opps2 extends Opps3{
    public static void  main(String args[]){
        Opps3 opps3= new Opps2();
        opps3.add();

    }
    @Override
    public void add(){
        System.out.println("From opps2");
    }
}
class Opps3{
    public void add(){
        System.out.print("From opps3");
    }
}
