import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("철수");
        queue.offer("영희");
        queue.offer("명자");
        queue.offer("철희");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);


    }
    
}
