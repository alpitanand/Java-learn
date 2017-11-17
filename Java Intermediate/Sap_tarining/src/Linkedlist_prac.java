/**
 * Created by Alpit on 02-07-2017.
 */
public class Linkedlist_prac<E> {
    private Nodes<E> head;
    private Nodes<E> tail;
    public void add(E element){
        Nodes<E> node = new Nodes<>();
        node.setElement(element);
        if(head == null){
            head = node;
            tail = node;
        }
        else {
            tail.setNextref(node);
            tail = node;
        }

    }
    public void travarse(){
        Nodes<E> tmp = head;
        while (true){
            if(tmp== null){
                break;
            }
        else {
                System.out.println(tmp.getElement());
           tmp = tmp.getNextref();
            }
        }

    }
public static void main(String args[]){

}

}
class Nodes<E>{
    private E element;
    private Nodes<E> nextref;

    public E getElement(){
        return element;
    }
    public Nodes<E> getNextref(){
        return nextref;
    }
    public void setElement(E element){
        this.element = element;

    }
    public void setNextref(Nodes<E> nextref){
        this.nextref = nextref;
    }

}
