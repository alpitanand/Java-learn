import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 05-07-2017.
 */
public class linked<E> {
    Node3<E> head;
    Node3<E> tail;

    public void add(E element) {
        Node3<E> node3 = new Node3<>();
        node3.setElement(element);
        if (head == null) {
            head = node3;
            tail = node3;
        } else {
            tail.setNextnode(node3);
            tail = node3;
        }
    }

    public void addafter(E element, E toadd) {
        Node3<E> temp = head;
        Node3<E> a = new Node3<>();
        a.setElement(toadd);
        while (true) {
            if (temp.getElement() == element) {

                a.setNextnode(temp.getNode());
                temp.setNextnode(a);
                break;
            } else {
                temp = temp.getNode();
            }
        }

    }

    public void iter() {
        Node3<E> temp = head;
        while (true) {
            if (temp.getNode() == null) {
                System.out.println(temp.getElement());
                break;
            }
            System.out.println(temp.getElement());
            temp = temp.getNode();

        }


    }

void printEven(){
        Node3<E> temp = head;
        int count=1;
        while (true){
            if(temp.getNode()==null && count%2==0){
                System.out.println(temp.getElement());
                break;
            }
            else if(count%2==0){
                System.out.println(temp.getElement());
            }
        temp=temp.getNode();
            count++;
        }
}
void reverseLinked() {
    Node3<E> prev = null;
    Node3<E> current = head;
    Node3<E> next = null;

        while(current!=null){
          next = current.getNode();
          current.setNextnode(prev);
          prev=current;
          current=next;

        }
        head=prev;
    }

}



class Node3<E> {
    Node3<E> nextnode;
    E element;

    Node3<E> getNode() {
        return nextnode;
    }

    E getElement() {
        return element;
    }

    void setElement(E element) {
        this.element = element;
    }

    void setNextnode(Node3<E> nextnode) {
        this.nextnode = nextnode;
    }

}

class Prachee {
    public static void main(String args[]) throws IOException {

        //BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        linked<Integer> linked = new linked<>();
        linked.add(3);
        linked.add(5);
        linked.add(2);
        linked.add(10);
        linked.add(12);
        linked.addafter(2,15);
        linked.addafter(3,100);
        linked.iter();
        System.out.println("==================================");
        linked.addafter(5, 19);
        linked.iter();
        System.out.println("==================================");
//        linked.printEven();
        System.out.println("===================================");
        linked.reverseLinked();
        linked.iter();
    }
}