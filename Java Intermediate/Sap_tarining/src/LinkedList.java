public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;

    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.addAfter(4,3);

        linkedList.traverse();
    }

    public void add(E element) {
        Node<E> node = new Node<>();
        node.setValue(element);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNextRef(node);
            tail = node;

        }
    }
    public void addAfter(E element,E after) {
        Node<E> tmp = head;
        Node<E> refnode = null;
        while (true) {
            if (tmp.getNextRef() == null) {
                System.out.println("underflow");
                break;
            } else {

                if (tmp.getValue() == after) {
                    refnode = tmp;
                    break;
                }
                tmp = tmp.getNextRef();
            }
        }
    if(refnode!=null){
            Node<E> node = new Node<>();
            node.setValue(element);
            node.setNextRef(tmp.getNextRef());
            tmp.setNextRef(node);
    }
    }


    public void traverse() {
        Node<E> tmp = head;
        while (true) {
            if (tmp == null) {
                break;
            }
            System.out.println(tmp.getValue());
            tmp = tmp.getNextRef();
        }
    }
}

class Node<E> {
    private E value;
    private Node<E> nextRef;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNextRef() {
        return nextRef;
    }

    public void setNextRef(Node<E> nextRef) {
        this.nextRef = nextRef;
    }
}