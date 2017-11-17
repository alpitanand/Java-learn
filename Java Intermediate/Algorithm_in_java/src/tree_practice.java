import java.io.IOException;

/**
 * Created by Alpit on 25-05-2017.
 */
public class tree_practice {
    public static void main(String args[])throws IOException
    {
        tree_practice tree_practice= new tree_practice();

    }
    public void run()
    {
        node node= new node(100);
        insert(node,110);
        insert(node,910);
        insert(node,10);
        insert(node,130);
        insert(node,100);
        insert(node,1340);
        insert(node,1430);
        insert(node,1043);
        insert(node,10);
        insert(node,2310);
        insert(node,1034);
    }

    private void insert(node node, int i) {
        if(i<node.value)
        {
            if(node.left!=null)
            {
                insert(node.left,i);
            }
            else
            {
                node.left=new node(i);
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
