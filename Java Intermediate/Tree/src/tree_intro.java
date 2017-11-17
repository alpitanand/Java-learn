import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Alpit on 28-05-2017.
 */
public class tree_intro {
    public static void main(String args[])throws IOException
    {
        HashMap<Integer,String> map= new HashMap<>();
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String s=obj.readLine();
        String arr[]=s.split(" ");
        Node3 n= new Node3(Integer.parseInt(arr[1]));
        for(int i=0;i<Integer.parseInt(arr[0])-1;i++)
        {
            String t=obj.readLine();
            int b=Integer.parseInt(obj.readLine());

            map.put(b,t);

            String g[]=t.split("");
            for(int m=0;m<g.length;m++)
            {
                if(g[m].equals("L"))
                {
                    addToleft(n,b);
                }
                else if(g[m].equals("R"))
                {
                    addToright(n,b);
                }
            }


        }
        tree_print(n);


    }

    private static void tree_print(Node3 n) {
        if (n != null) {
            tree_print(n.left);
            System.out.print(n.value + " ");
            tree_print(n.right);
        }
    }

    private static void addToright(Node3 n, int b) {

            if(n.left!=null)
            {
                addToleft(n.left,b);
            }
            else
            {
                n.left = new Node3(b);
            }
        }



    private static void addToleft(Node3 n, int b) {

            if(n.right!=null)
            {
                addToleft(n.right,b);
            }
            else
            {
                n.right = new Node3(b);
            }
    }
}

class Node3
{
    Node3 right;
    Node3 left;
    int value;
    public Node3(int i)
    {
        value=i;
    }
}


