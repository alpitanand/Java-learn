import java.util.Scanner;
class Anshal

{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        printstr(str);
    }
    public static void printstr(String s)
    {
        System.out.println("String = " +s);
        System.out.println("using tochar array");
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);
        }
        System.out.println("using charAt ");
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
