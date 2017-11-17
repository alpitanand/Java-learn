import java.util.ArrayList;
import java.util.Scanner;
class Prime {
    static ArrayList<Integer> arr;
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int n = 127;
        int num = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            int Counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    Counter++;
                }
            }
            if (Counter == 2) {
                if (i >= 67) {
                    j++;
                    System.out.println(i);
                    arr.add(i);
                }
            }


        }
    }
}