/**
 * Created by Alpit on 03-09-2017.
 */
public class trialByerroe {
    public static void main(String args[]){
        A a= new A();
        a.setB();

    }
}
class A{
    public A(){
        System.out.println("Prachee");
    }
    private int b;
    int c=10;
    private void call(){
        System.out.println("Calling");
    }
    public void calling(){
        System.out.println("Calling baba");
    }
    void setB(){
        this.b = 10;
    }
    public int getB(){
        return b;
    }
}
class B{
    private B(){
        System.out.println("Alpit");
    }
}
