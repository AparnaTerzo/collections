import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        System.out.println(queue);

        queue.remove("b");
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.contains("c"));

        queue.clear();
        System.out.println(queue);
    }

}
