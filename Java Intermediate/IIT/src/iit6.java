import java.io.IOException;

/**
 * Created by Alpit on 18-09-2016.
 */
public class iit6 {
    public static void main(String args[]) throws IOException
    {
       int y=0;
        for(int i =0;i<=100;i++)
        {
            for(int j=0;j<=100;j++)
            {
                for(int k=0;k<=100;k++)
                {
                    if(i+j+k<=100)
                    {
                         y= y+1;
                    }
                }
            }
        }
    System.out.println(y);
    }
}
