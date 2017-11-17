import java.util.Scanner;
class magical_alphabaet {
    static int prime(int p) {
        int count = 0;
        for (int i = 2; i < (p / 2 + 1); i++) {
            if (p % i == 0) {
                count++;
                break;
            } else
                count = count;
        }
        return count;
    }
    static int less(int b) {
        int c = prime(b);
        on:
        while (c > 0) {
            b = b - 1;
            c = prime(b);
            if (c > 0)
                continue on;
            else
                break on;
        }
        return b;}

    static int greater(int a) {
        int c = prime(a);
        on:
        while (c > 0) {
            a = a + 1;
            c = prime(a);
            if (c > 0)
                continue on;
            else
                break on;
        }
        return a;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int length = sc.nextInt();
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                int t=0;
                int g[] = new int[length];
                int l[] = new int[length];
                int m[]=new int[length];
                t = s.charAt(j);
                int r = prime(t);
                if (r > 0) {
                    g[j] = greater(t + 1);
                    l[j] = less(t - 1);
                    int gd=0;
                    int ld=0;
                    gd=g[j]-t;
                    ld=t-l[j];
                    if(gd>ld)
                        m[j]=l[j];
                    else if(ld>gd)
                        m[j]=g[j];
                    else if(ld==gd)
                        m[j]=l[j];
                }
                else
                {
                    m[j]=t;
                }
                char c=(char)m[j];
                System.out.print(c);
            }
        }
    }
}