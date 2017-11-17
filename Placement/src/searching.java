/**
 * Created by Alpit on 08-09-2017.
 */
public class searching {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int z = 7;
        int high = a.length;

        int low = 1;
        int m = binarySearch(a, high, low, z);
        System.out.println(m);
    }

    private static int binarySearch(int a[], int h, int l, int ser) {
        int mid = (h+l)/2;
        if(a[mid]==ser){
            System.out.println("No is found");
        }
        else if(a[mid]>ser){
            return binarySearch(a,mid,l,ser);
        }
        else if(a[mid]<ser){
            return binarySearch(a,h,mid,ser);
        }
   return a[mid];
    }
}
