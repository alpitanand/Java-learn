import java.util.ArrayList;

/**
 * Created by Alpit on 05-07-2017.
 */


class Imp<E>{

    ArrayList<E> arrayList = new ArrayList<>();
    public void push(E element){
        arrayList.add(element);
    }

    public void pop(){
        arrayList.remove(arrayList.size()-1);
    }
    public void iter(){
        for(E i:arrayList){
            System.out.println(i);
        }
    }
    public E peek(){
        return arrayList.get(arrayList.size()-1);
    }
}
class check{
    public static void main(String args[]){
        Imp<Integer> imp = new Imp<>();
        imp.push(10);
        imp.push(12);
        imp.push(15);
        imp.iter();
        System.out.println("======================================");
        imp.pop();
        imp.iter();
        System.out.println("=======================================");
        int j = imp.peek();
        System.out.println("Peeking "+j);

    }
}