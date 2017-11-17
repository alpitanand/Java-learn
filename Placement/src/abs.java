/**
 * Created by Alpit on 08-09-2017.
 */
public abstract class abs {

    private int a;
    private int b;
    abs(int a,int b){
        this.a=a;
        this.b=b;
    }
   abstract void eat();
   abstract void drink();
   void arun(){
       System.out.println("I am kauwa");
       System.out.println(a);
       System.out.println(b);
   }
}
interface al{

}
class prachee extends abs{

    prachee(int a, int b) {
        super(a, b);
    }
    public static void main(String args[]){
        prachee prachee= new prachee(10,20);
        prachee.arun();
    }

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }
}
