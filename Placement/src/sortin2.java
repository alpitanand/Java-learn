/**
 * Created by Alpit on 09-09-2017.
 */
@SuppressWarnings("Duplicates")
public class sortin2 {
    public static void main(String args[]){
        int a[]={2,3,451,3,4,52,5};
        bubble(a);
        selction(a);
        insertion(a);
    }

    private static void insertion(int[] a) {
        int l=a.length;
        int key;
        int j;
        for(int i=1;i<l;i++){
            key=a[i];
            j=i-1;
            while (j>=0&&a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        System.out.println(" ");
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    private static void selction(int[] a) {
        int l=a.length;
        int index;
        int temp;
        for(int i=0;i<l;i++){
           index=i;
            for(int k=i;k<l;k++){
                if(a[index]>a[k]){
                    index=k;
                }
            }
        temp=a[index];
         a[index]=a[i];
         a[i]=temp;
        }
        System.out.println("");
    for(int y:a){
            System.out.print(y+" ");
    }
    }

    private static void bubble(int[] a) {
        int l=a.length;
        int temp;
        for(int i=0;i<l;i++) {
            for (int j = 0; j < l - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    for(int i:a){
            System.out.print(i+" ");
    }
    }
}
