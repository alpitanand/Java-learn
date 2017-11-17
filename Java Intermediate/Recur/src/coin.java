
class coin
{

    static int minCoins(int coins[], int m, int V)
    {

        if (V == 0) {
         System.out.println("base case");
            return 0;
        }


        int res = Integer.MAX_VALUE;
System.out.println("Res value "+res);

        for (int i=0; i<m; i++)
        {
            System.out.println("of loop "+i);
            if (coins[i] <= V)
            {
System.out.println(coins[i]);
                int sub_res = minCoins(coins, m, V-coins[i]);
                System.out.println("This is subres "+sub_res+" This is v "+(V-coins[i])+" and coin i "+coins[i]);


                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
                System.out.println("This is res "+res);
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int coins[] =  {11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int m = coins.length;
        //Change V for checking the op
        int V = 50;
        System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
    }
}