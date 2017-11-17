import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alpit on 05-06-2017.
 */
public class arr_check {
    public static void main(String args[])throws IOException
    {
        List<Integer> list= new ArrayList<>();
        ArrayList<alpit> arrayList= new ArrayList<>();
        ArrayList<prachee> arrayList1=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            arrayList.add(new alpit(20,21));
            arrayList1.add(new prachee("Alpit",arrayList,"Alpit"));

        }


    System.out.println(arrayList1.get(0).alpits.get(0).getAlpit());
    }
}
 class alpit{
     int alpit;
     int prachee;

     public alpit(int alpit, int prachee) {
         this.alpit = alpit;
         this.prachee = prachee;
     }

     public int getAlpit() {
         return alpit;
     }

     public void setAlpit(int alpit) {
         this.alpit = alpit;
     }

     public int getPrachee() {
         return prachee;
     }

     public void setPrachee(int prachee) {
         this.prachee = prachee;
     }
 }
class prachee
{
    String alpit;
    String prachee;
    ArrayList<alpit> alpits;

    public prachee(String alpit, ArrayList<alpit> alpits, String prachee) {
        this.alpit = alpit;
        this.alpits = alpits;
        this.prachee = prachee;
    }
}
