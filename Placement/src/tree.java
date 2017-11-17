import com.sun.image.codec.jpeg.TruncatedFileException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Created by Alpit on 06-09-2017.
 */
public class tree {

    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    tree tree= new tree();
    TreeNode root= new TreeNode(12);
    tree.insert(root,10);
    tree.insert(root,20);
        tree.insert(root,22);
        tree.insert(root,234);
        tree.insert(root,34);
        tree.insert(root,23);
        tree.insert(root,231);
        tree.insert(root,433);
        tree.insert(root,32);
        tree.insert(root,432);
        tree.traverse(root);


    }
TreeNode insert(TreeNode root,int id){
        TreeNode treeNode= new TreeNode(id);
        if(root==null){
            root=treeNode;
            return root;

        }
        else if(root.data>id){
            if(root.left!=null){
                return (insert(root.left,id));
            }
            else {
                root.left=new TreeNode(id);
            }

        }
        else if(root.data<id){
            if(root.right!=null){
                return (insert(root.right,id));
            }
            else {
                root.right=new TreeNode(id);
            }

        }
return root;
}
public void traverse(TreeNode root){
    if(root!=null){
        traverse(root.left);
        System.out.println(root.data);
        traverse(root.right);
    }

}


}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int n){
        left=null;
        right=null;
        data=n;
    }
}
