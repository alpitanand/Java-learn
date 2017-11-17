import java.io.IOException;

/**
 * Created by Alpit on 18-07-2017.
 */
public class recur5 {
    public static void main(String args[])throws IOException{
        fun1(5);
    }

    private static void fun1(int i) {
        int a=0;
        if(i>0){
            fun1(i-1);
        }
        for(int k=0;k<i;k++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
