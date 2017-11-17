import java.util.Scanner;
public class cg {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter your String2");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int num=(s.indexOf("XY"));
        while(num!=s.lastIndexOf("XY"))
        {
            if(num==0)
            {
                System.out.print(s.charAt(num+2));
            }
            else
            {
                System.out.print(s.charAt(num-1)+""+s.charAt(num+2));
            }
            num=(s.indexOf("XY",num+1));
        }
        if(num==s.lastIndexOf("XY"))
        {
            try{
                System.out.print(s.charAt(num-1)+""+s.charAt(num+2));
            }
            catch(Exception e)
            {
                System.out.print(s.charAt(num-1));
            }
        }
    }
}
