import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExp {
    public static void main(String [] args){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(74);
        dq.add(8);
        dq.add(84);
        dq.offerFirst(849);
        dq.pollFirst();
        System.out.println(dq);

    }
}
