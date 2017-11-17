import java.io.IOException;
import java.util.Stack;

/**
 * Created by Alpit on 06-09-2017.
 */
public class Implement_stack {
    public static void main(String args[])throws IOException{
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<100;i=i+2){
            stack.push(i);
        }
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
