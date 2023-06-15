import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueInterface
{
    public static void main(String[] args) {
        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.add(10);
        dequeue.add(20);
        dequeue.add(30);
        System.out.println(dequeue);
        System.out.println(dequeue.removeFirst());
        System.out.println(dequeue);
    }
}
