import java.util.Scanner;

/**
 * Created by Alpit on 23-06-2017.
 */
public class Anshal2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the _______");
        char c=sc.next().charAt(0);
        SpecialChar(c);
    }

    public static void SpecialChar(char c)
    {
        if(c>=32 && c<=41)
        {
            System.out.println(c+ "is special character");
        }
        else
        {
            System.out.println(c+ "is not special character");
        }
    }
}
