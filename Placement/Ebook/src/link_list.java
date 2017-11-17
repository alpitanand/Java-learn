import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 25-09-2017.
 */
public class link_list {
    private Node head;
    private Node tail;
    private int length=0;
    public static void main(String args[])throws IOException{

        link_list l = new link_list();
        l.add(5);
        l.add(12);
        l.add(34);
        l.add(23);
        l.traverse(l.head);
        l.insertAtHead(0);
        l.traverse(l.head);
        l.insertAtTail(1212,l.head);
        l.traverse(l.head);
        l.insertBetweenHeadandTail(3,l.head,1234);
        l.traverse(l.head);
        l.head=delHead(l.head);
        l.traverse(l.head);
        l.tail = delTail(l.head);
        l.traverse(l.head);
    }
    private void insertAtHead(int k){
        Node node= new Node();
        node.setData(k);
        node.setNextnode(head);
        head=node;
    }
    private void insertAtTail(int u, Node head){
        Node node = new Node();
        node.setData(u);
        while (head.getNextnode()!=null){
            head=head.getNextnode();
        }
        head.setNextnode(node);

    }
    private static Node delHead(Node head){
        head=head.getNextnode();
        return head;
    }
    private static Node delTail(Node head){
        while (head.getNextnode().getNextnode()!=null){
            head = head.getNextnode();
        }
        head.setNextnode(null);
        return head;
    }
    private void insertBetweenHeadandTail(int position, Node head, int data){
        Node node = new Node();
        node.setData(data);
        int l=0;
        while (l!=position-1){
            head = head.getNextnode();
            l++;
        }
        Node n1 = head.getNextnode();
        node.setNextnode(n1);
        head.setNextnode(node);
    }

    private void add(int i) {
        Node node= new Node();
        node.setData(i);
        if(head==null){
           head=node;
           tail=node;
        }
        else {
            tail.setNextnode(node);
            tail=node;
        }

    }

    private  void traverse(Node head){
        while (head!=null){
            System.out.print(head.getData()+" ");
            head = head.getNextnode();
        length++;
        }

    System.out.println(" ");
    }

}
class Node{
   private Node nextnode;
   private int data;

    public void setNextnode(Node nextnode){
        this.nextnode =nextnode;
    }
    public Node getNextnode(){
        return nextnode;
    }
    public void setData(int data){
        this.data=data;
    }
    public int getData(){
        return data;
    }
}
