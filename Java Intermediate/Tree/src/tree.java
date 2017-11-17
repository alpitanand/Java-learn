import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 22-05-2017.
 */
public class tree {
    public static void main(String args[]) throws IOException {

        tree t = new tree();
        t.run();

    }

    private void run() throws IOException {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        node n = new node(25);
        System.out.println("Building node with value " + n.value);
        insert(n, 12);
        insert(n, 103);
        insert(n, 14);
        insert(n, 1510);
        insert(n, 1);
        insert(n, 7);
        insert(n, 18);
        insert(n, 1343);
        insert(n, 20);

        inorder(n);

        System.out.println("Enter a no to be checkd if it is present or not");
        int a = Integer.parseInt(obj.readLine());
        check(a, n);
    }

    private void check(int b, node d) {
        if (b == d.value) {
            System.out.println("Number found");


        } else if (b < d.value) {
            if (d.left != null) {
                if (d.left.value == b) {
                    System.out.println("Number found");

                } else {
                    check(b, d.left);
                }
            }
        } else if (b > d.value) {
            if (d.right != null) {
                if (d.right.value == b) {
                    System.out.println("Number found");

                } else {
                    check(b, d.right);
                }
            }
        }
    }

    public void inorder(node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }


    }


    private void insert(node n, int value) {
        if (value < n.value) {

            if (n.left != null) {
                insert(n.left, value);
            } else {
                System.out.println("  Inserted " + value + " to left of Node " + n.value);
                n.left = new node(value);

            }
        } else if (value > n.value) {
            if (n.right != null) {
                insert(n.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of Node " + n.value);
                n.right = new node(value);
            }


        }
    }


}

class node {
    node right;
    node left;
    int value;

    node(int i) {
        value = i;
    }


}

