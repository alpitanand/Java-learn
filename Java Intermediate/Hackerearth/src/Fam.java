import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alpit on 26-05-2017.
 */
public class Fam {
    String father;
    String mother;
    String sister;
    String brother;
String r;

    public Fam(String father, String sister, String brother, String mother) {
        this.father = father;
        this.sister = sister;
        this.brother = brother;
        this.mother = mother;
    }

    public Fam(String father) {
        this.father = father;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }
@Override
    public String toString()
    {
        return father;


    }


    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getSister() {
        return sister;
    }

    public void setSister(String sister) {
        this.sister = sister;
    }

    public String getBrother() {
        return brother;
    }

    public void setBrother(String brother) {
        this.brother = brother;
    }
}
class add {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Fam> arrayList = new ArrayList<>();
        Fam fam;
        for (int i = 0; i < 2; i++) {
            String f = obj.readLine();
           String s = obj.readLine();
            String b = obj.readLine();
            String m = obj.readLine();
             fam = new Fam(f,s,b,m);
            arrayList.add(fam);

        }
      for(Fam fam2:arrayList)
      {
         System.out.println(fam2.getBrother());
      }


    }
}