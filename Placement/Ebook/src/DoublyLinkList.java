import java.util.stream.Stream;

/**
 * Created by Alpit on 28-09-2017.
 */
public class DoublyLinkList {
    private DoubleNode head;
    private DoubleNode tail;
public static void main(String args[]){

}
private void add(int k){
    DoubleNode doubleNode = new DoubleNode();
    doubleNode.setData(k);
    if (head==null){
        head = doubleNode;
        tail =doubleNode;
    }
    else {
        tail.setNext(doubleNode);
        tail.setPrev(head);
        tail = doubleNode;
    }

}
}
class DoubleNode{
    private DoubleNode next;
    private DoubleNode prev;
    private int data;

    public void setNext(DoubleNode next){
        this.next = next;
    }
    public DoubleNode getNext(){
        return next;
    }
    public void setPrev(DoubleNode prev){
        this.prev = prev;
    }
    public DoubleNode getPrev(){
        return prev;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
}
