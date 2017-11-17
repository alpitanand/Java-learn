import java.util.Scanner;
class Anshal4
{
    public static void main(String[] args)
    {
        int ocount=0, ecount=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter size of the array");
        //yaha bracket miss hai
        int s = sc.nextInt();

        int a[] = new int[s];
        System.out.println("Enter the elements");

        for (int i=0; i<s ; i++)
        {
            //yaha bhi
            a[i] = sc.nextInt();
        }
        System.out.println("Odd numbers are");


        for (int i=0; i<s; i++)
        {
            if (a[i] % 2 != 0)
            {
                //yaha output wale mein double quote nai hoga
                System.out.println(a[i]);
                ocount= ocount+1;
            }

        }
        //ocount ko loop ke bahar likiye...op would look clean
        System.out.println("No. of odd numbers" +ocount);

        System.out.println("Even numbers are");
        for (int i=0; i<s; i++)
        {
            if (a[i] % 2 == 0)
            {
                //same mistake as above
                System.out.println(a[i]);
                ecount= ecount+1;
            }

        }
        //here also
        System.out.println("No. of even numbers" +ecount);
    }

}
