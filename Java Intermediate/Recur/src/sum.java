/**
 * Created by Alpit on 18-07-2017.
 */
public class sum {
    static int k=0;
    static int y=0;
    public static void main(String args[]){
        int a=56;
        int b=sumof(a);
        int m=checkpalin(b);
        if(m==b){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    private static int checkpalin(int b) {
        if(b==0){

            return (y*10)+b;
        }
        y=(b%10)+(y*10);
        checkpalin(b/10);
        return y;
    }

    private static int sumof(int a) {

        if(a==0){
            return 0;
        }
        k=a%10;
       return (k+ sumof(a/10));
    }
}
