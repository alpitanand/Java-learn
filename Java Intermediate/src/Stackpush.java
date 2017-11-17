import java.util.Stack;

/**
 * Created by Alpit on 29-11-2016.
 */
public class Stackpush {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<>();
        stack.push("bottom");
        printstack(stack);
        stack.push("second");
        printstack(stack);
        stack.push("third");
        printstack(stack);
        stack.pop();
        printstack(stack);
        stack.pop();
        printstack(stack);
        stack.pop();
        printstack(stack);
    }

    private static void printstack(Stack<String> s) {
        if(s.empty())
        {
            System.out.println("Stack is empty");
        }
    else
            System.out.print(s);




    }
}
