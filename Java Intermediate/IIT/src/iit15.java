import java.io.IOException;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit15 {
    public static void main(String args[]) throws IOException {
        int z=0;
int y=0;
        int p=0;
   for(int a=100;a<999;a++) //a
   {
       for(int b=100;b<999;b++) //b
       {
           for(int c=100;c<999;c++) //c
           {
                z=a^2;
               y=b^2;
               if((z==(b*c)+4)&&(y==(c*a)+4))
               {
                   p++;
               }
           }
       }
   }
    System.out.println(p);
    }
}