/**
 * Created by Alpit on 03-07-2017.
 */
public class xy {
    void m1(Integer i){
        System.out.println("From here" + i);
    }
    void m1(int i){
        System.out.println("From there"+ i);
    }
    public static void main(String args[]){
        xy xy = new xy();
        Integer k =3;
        xy.m1(k);
    }
}
