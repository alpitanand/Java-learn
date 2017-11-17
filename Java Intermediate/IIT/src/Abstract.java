/**
 * Created by Alpit on 24-02-2017.
 */
abstract class Abstract {
    double dim1,dim2;
    Abstract(double a,double b)
    {
        dim1=a;
        dim2=b;

    }
abstract double area();
}

class Rect extends Abstract
{

    Rect(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        return dim1*dim2;
    }
}

class Abstractclass
{
   public static void main(String args[]){
       Rect r= new Rect(10,20);
       Abstract a;

       System.out.println(r.area());
   }

}
