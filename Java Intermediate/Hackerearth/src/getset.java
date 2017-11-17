import java.io.IOException;

/**
 * Created by Alpit on 14-05-2017.
 */
public class getset {
    private String alpit;
    private String prachee;


    public getset(String alpit, String prachee) {
        this.alpit = alpit;
        this.prachee = prachee;
    }

  public String getAlpit()
  {
      return alpit;
  }
    public String getPrachee()
    {
        return prachee;
    }
public void setAlpit(String alp)
{
    alpit=alp;
}
public  void setPrachee(String pra)
{
    prachee=pra;
}
}
class geeet{
    public static void main(String args[])throws IOException
    {
        getset getset= new getset("mai","tu");
        System.out.println(getset.getAlpit());
        getset.setAlpit("tutut");
        System.out.println(getset.getAlpit());
    }
}
