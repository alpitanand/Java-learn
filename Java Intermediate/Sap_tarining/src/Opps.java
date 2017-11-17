/**
 * Created by Alpit on 09-07-2017.
 */
public class Opps extends alpit implements prachee{

    @Override
    int sum() {
        return 0;
    }

    @Override
    public void add() {

    }

    @Override
    public void div() {

    }
}
abstract class alpit{
   abstract int sum();
   abstract void div();
   void run()
   {
       System.out.println("Hellow");
   }
}
interface prachee{
void add();
void div();
}