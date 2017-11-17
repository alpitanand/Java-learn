/**
 * Created by Alpit on 11-07-2017.
 */
public class Link {

    public static void main(String args[]) {
        making making = new making();
        making.add(1);
        making.add(4);
        making.add(7);
        making.add(12);
        making.add(23);
        making.sorted_add(5);
        making.traverse();
        System.out.println("=================");
       making.addinpos(6,256);
        making.traverse();

    }
}


class making {
    CNode head;
    CNode tail;

    public void add(int i) {
        CNode cNode = new CNode();
        cNode.value = i;
        if (head == null) {
            head = cNode;
            tail = cNode;
        } else {
            tail.next = cNode;
            tail = cNode;
            tail.next = head;
        }

    }


    public void traverse() {
        CNode temp = head;
        do {
            System.out.println(temp.value);
            temp = temp.next;
        } while (!(temp.equals(head)));
    }

    public void sorted_add(int i) {
        CNode temp = head;
        CNode x;
        CNode cNode = new CNode();
        cNode.value = i;
        while (true) {
            if (temp.next.value < i) {
                temp = temp.next;
            } else {
                break;
            }


        }
        x = temp.next;
        temp.next = cNode;
        cNode.next = x;
    }

    public void addinpos(int i,int val) {
        CNode temp=head;
        CNode prev=null;
        CNode cNode= new CNode();
        cNode.value=val;
        int c=0;
        while (c!=i){
            prev=temp;
            temp=temp.next;
            c++;
        }
        prev.next=cNode;
        cNode.next=temp;
    }
}

class CNode {
    int value;
    CNode next;
}