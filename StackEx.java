import java.util.LinkedList;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        // 동기화
        Stack<String> stack = new Stack<>();
        // 비동기화
        LinkedList<String> stack2 = new LinkedList<>();

        stack.push("100");
        stack.push("500");
        stack.push("1000");
        stack2.push("100");
        stack2.push("500");
        stack2.push("1000");

        System.out.println(stack);
        System.out.println(stack2);

        System.out.println(stack.pop()+":"+stack2.pop());


        
    }
    
}
