import java.util.Scanner;
        import java.util.*;
        import java.lang.*;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;



class U
{

    public static Boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
            return false;

    }
    public static void main(String[] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //enter no of test cases
        int z=sc.nextInt();

        for(int a=1;a<=z;a++)
        {
            //enter length of string
            String prime="";
            int d=sc.nextInt();
            String s=br.readLine();
            int strLen=s.length();
            if(d==strLen)
            {
                int num1=0,num2=0,diff1=0,diff2=0;
                char c1,c2;
                for(int k=0;k<s.length();k++)
                {
                    char ch=s.charAt(k);
                    int num=(int)ch;
                    for(int i=num;;i++)
                    {
                        if(isPrime(i))
                        {
                            diff1=i-num;
                            num1=i;
                            c1=(char)num1;
                            break;
                        }
                    }
                    for(int i=num;;i--)
                    {
                        if(isPrime(i))
                        {
                            diff2=num-i;
                            num2=i;
                            c2=(char)num2;
                            break;
                        }
                    }
                    if(diff1<diff2)
                    {
                        //System.out.println(""+c1);
                        prime=prime+""+c1;

                    }
                    else if(diff2<diff1)
                    {
                        //System.out.println(""+c2);
                        prime=prime+""+c2;

                    }
                    else if(diff1==diff2)
                    {
                        //System.out.println(""+c2);
                        prime=prime+""+c2;
                    }
                }

            }
            else
                break;
            System.out.println(""+prime);

        }

    }
}