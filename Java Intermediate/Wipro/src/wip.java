import javax.security.sasl.SaslServer;
import java.io.IOException;

/**
 * Created by Alpit on 20-06-2017.
 */
public class wip {
    public static void main(String args[]) {

String input1="Alpit";
boolean output1;
        StringBuilder s;
        StringBuilder sb= new StringBuilder(input1);

        s=sb.reverse();
        String k= s.toString();
        if(s.equals(input1))
        {
            output1=true;
            System.out.print(output1);
        }
        else{
            output1=false;
            System.out.print(output1);
        }




    }
}
