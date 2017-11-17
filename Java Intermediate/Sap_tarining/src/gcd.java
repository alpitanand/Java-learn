import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Alpit on 05-07-2017.
 */
public class gcd {
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int gcd=0;
        int a= Integer.parseInt(obj.readLine());
        String s ="23984092370457240572397927982459824758783765757957957657695789508650786875769507850785078470647587690989079789686785675765464534534243248798689248939840238402380482309849823009238409238408320482308402349023403840238048823490239427489237489237402384092384038402385023785092375095709230";
        BigInteger bigInteger = new BigInteger(s);
       for(int i=1;i<=a;i++){
           BigInteger j = new BigInteger(Integer.toString(i));
           if((bigInteger.mod(j)).equals(new BigInteger("0"))&& a%i==0){
               gcd =i;
           }
       }
       System.out.println(bigInteger.isProbablePrime(2));
       System.out.println(s.length());
    System.out.println(gcd);
    }
}
