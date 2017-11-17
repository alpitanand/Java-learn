import java.io.IOException;

/**
 * Created by Alpit on 15-08-2017.
 */
public class Binary_Search {
    public static void main(String args[]) throws IOException {
        int a[] = {1, 2, 3, 4, 5, 6,  7, 8, 9};
        int b = 812;
        int high = a.length-1;
        int low = 0;
        int c = binarySearching(a, b, high, low);
        System.out.println(c);
    }

    private static int binarySearching(int[] a, int b, int high, int low) {

        if(low>high||high<low){
            return 0;
        }
        int mid = (high + low) / 2;
        if (a[mid] == b) {
            return 1;
        } else if (b > a[mid]) {
            low = mid + 1;
            return binarySearching(a, b, high, low);
        } else if (b < a[mid]) {
            high = mid - 1;
            return binarySearching(a, b, high, low);
        } else {
            return 0;
        }
    }

}

