import java.util.LinkedList;
import java.util.Queue;

public class QueueExp {
    public static void main(String [] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.add(5);
        q.add(93);
        q.remove(1);
        System.out.println(q);
        System.out.println("Removed" +q.remove());
        System.out.println("Poll used"+ q.poll());

    }
}
