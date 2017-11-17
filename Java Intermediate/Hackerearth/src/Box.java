/**
 * Created by Alpit on 15-03-2017.
 */
public class Box {
     int width;
     int height;
     int length;
    Box(Box ob){

    }
    Box(int i,int j,int k)
    {
        width=i;
        height=j;
        length=k;
    }
double vol()
{
    return width*height*length;
}
}
