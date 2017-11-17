/**
 * Created by Alpit on 07-07-2017.
 */
public class Bubble_sort {
    public static void main(String args[]){
        int temp;
        int a[]= {100,23,34,24,234,234,24,1,1123,24};
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                 temp=a[j-1];
                 a[j-1]=a[j];
                 a[j]=temp;
                }
            }
        }
    for(int i:a){
            System.out.println(i);
    }
    }
}
