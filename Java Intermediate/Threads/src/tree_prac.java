import java.io.IOException;

/**
 * Created by Alpit on 27-05-2017.
 */
public class tree_prac {
    public static void main(String arg[])throws IOException
    {
        run2();
    }

    private static void run2() {
        System.out.println("Strating the value with 25");
        node n= new node(25);

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
        preoder(n);
    }

    private static void preoder(node n) {
        if(n!=null)
        {
            preoder(n.left);
            preoder(n.right);
            System.out.print(n.value+" ");

        }

    }

    public static void inorder(node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }

    }

    private static void insert(node n, int i) {
        if(i<n.value)
        {
            if(n.left!=null)
            {
                insert(n.left,i);
            }

            else
            {
                n.left= new node(i);
            }
        }
        else if(i>n.value)
        {
            if(n.right!=null)
            {
                insert(n.right,i);
            }
            else
            {
                n.right= new node(i);
            }
        }
    }


}
class node
{
    node left;
    node right;
    int value;
    node(int i)
    {
        value=i;
    }
}
