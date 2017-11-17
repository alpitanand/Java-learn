/**
 * Created by Alpit on 03-09-2017.
 */
public class check {
    protected void msg(){
        System.out.println("Protected");
    }
    public void prachee(){
        System.out.println("Prachee");
    }
}
class M extends check{
public static void main(String args[]){
    M m = new M();
    m.prachee();
    m.msg();
}
public void prachee(){
    System.out.println("****");

}
public void msg(){
    System.out.println("++++++++");

}


}
