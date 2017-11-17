/**
 * Created by Alpit on 15-03-2017.
 */
public class boxweight extends Box {
   private int weight;
    boxweight(boxweight ob)
    {
super(ob);
        weight=ob.weight;
    }
boxweight(int i,int j,int k,int we){
    super(i,j,k);
    weight=we;
}
public void area()
{
    int arr=weight*height*length*width;
    System.out.println(arr+" from area");
}
}
