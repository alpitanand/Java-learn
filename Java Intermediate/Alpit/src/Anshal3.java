import java.util.Scanner;


class Anshal3
{
   static Scanner sc;
    public static void main(String[] args)
    {
       sc =  new Scanner(System.in);
        System.out.println("enter the size of an array");
        int s = sc.nextInt();
        int[] intarr = inputarray(s);
    }
    public static int[] inputarray(int s)
    {//yaha bracket galt hai
        int[] intarr = new int [s];
        //Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements");
        for (int i=0;i<s ;i++ )
        {
            //yaha bracket galt hai
            intarr[i] = sc.nextInt();
        }
        return intarr;
    }
}
