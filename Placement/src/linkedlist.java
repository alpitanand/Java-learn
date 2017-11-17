import java.io.IOException;


/**
 * Created by Alpit on 06-09-2017.
 */
public class linkedlist {
    private Node head;
    private Node tail;
    public static void main(String args[])throws IOException{

        linkedlist linkedlist= new linkedlist();
        linkedlist.add(5);
        linkedlist.add(12);
        linkedlist.add(20);
        linkedlist.add(23);
        linkedlist.add(45);
        linkedlist.traverse();
        linkedlist.makeitcircular();
        linkedlist.traverse();
    }
   private void add(int a){
        Node n = new Node();
        n.setA(a);
        if(head==null){
            head=n;
            tail=n;
        }
        else {
            tail.setNext(n);
            tail=n;
        }
    }
    private void makeitcircular(){
       tail.setNext(head);
    }
   private void traverse(){
        Node temp = head;
        while (true) {
            if (temp == null) {
                break;
            } else {
                System.out.print(temp.getA(temp) + " ");
                temp = temp.getNext();
            }
        }

    }
}


class Node{
   private Node e;
   private int a;
    int getA(Node x)
    {
        return x.a;
    }
    void setA(int b)
    {
        a=b;
    }
    void setNext(Node next)
    {
        e=next;
    }
    Node getNext()
    {
        return e;
    }
}
