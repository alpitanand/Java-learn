import java.io.IOException;
import java.sql.SQLSyntaxErrorException;
import java.util.*;
import java.util.LinkedList;

/**
 * Created by Alpit on 08-07-2017.
 */
public class Tree<E extends Comparable<E>> {

int max_level=0;
    public void insert(Blocks<E> n, E value) {
        if (value.compareTo(n.value) < 0) {
            if (n.left != null) {
                insert(n.left, value);
            } else {
                n.left = new Blocks<>(value);
            }
        }
        if (value.compareTo(n.value) > 0) {
            if (n.right != null) {
                insert(n.right, value);
            } else {
                n.right = new Blocks<>(value);
            }
        }

    }

    public void transverse(Blocks b) {
        if (b.left != null) {
            transverse(b.left);
        }
        System.out.print(b.getValue() + " ");
        if (b.right != null) {
            transverse(b.right);
        }
    }

    public void preorder(Blocks b) {
        if (b != null) {
            System.out.print(b.getValue() + " ");
            preorder(b.left);
            preorder(b.right);
        }
    }

    public void inorder(Blocks b) {
        if (b != null) {
            inorder(b.left);
            System.out.print(b.getValue() + " ");
            inorder(b.right);
        }
    }

    public void postorder(Blocks b) {
        if (b != null) {
            postorder(b.left);
            postorder(b.right);
            System.out.print(b.getValue() + " ");
        }
    }

    public int height(Blocks b) {
        if (b == null) {
            return 0;
        } else {
            int maxRight = height(b.right);
            int maxLeft = height(b.left);
            return 1 + ((maxLeft > maxRight) ? maxLeft : maxRight);
        }
    }

    void printLevelOrder(Blocks n) {
        Queue<Blocks> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            Blocks temp = queue.poll();
            System.out.println(temp.getValue() + " ");
            if(temp.right!=null){
                queue.add(temp.right);
            }
            if(temp.left!=null){
                queue.add(temp.left);
            }

        }
    }
    void leftView(Blocks n,int level){
      if(n==null){
          return;
      }
      if(max_level<level){
          System.out.println(n.getValue()+" ");
          max_level=level;
      }
        leftView(n.left,level+1);
      leftView(n.right,level+1);
    }
}

class Blocks<E> {
    Blocks<E> left;
    Blocks<E> right;
    E value;

    Blocks(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }
}

class put {
    public static void main(String args[]) throws IOException {
        Tree<Integer> tree = new Tree<>();
        Blocks<Integer> n = new Blocks<>(12);
//        tree.insert(n, 24);
//        tree.insert(n, 45);
//        tree.insert(n, 12);
//        tree.insert(n, 12);
//        tree.insert(n, 67);
//        tree.insert(n, 100);
//        tree.insert(n, 120);
//        tree.insert(n, 208);
//        tree.insert(n, -12);
        //tree.insert(n,12);
        tree.insert(n,10);
        tree.insert(n,30);
        tree.insert(n,25);
        tree.insert(n,40);
        tree.transverse(n);
        System.out.println("");
        tree.preorder(n);
        System.out.println("");
        tree.inorder(n);
        System.out.println(" ");
        tree.postorder(n);
        int height = tree.height(n);
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("Height is " + height);
        System.out.println("===========================================");
        tree.printLevelOrder(n);
        System.out.println("============================================");
        tree.leftView(n,1);
    }
}