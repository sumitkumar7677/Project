import java.util.Stack;
import java.util.LinkedList;
import java.util.*;

public class StackExp {
    public static void main(String[] args) {
        Stack<Integer> St = new Stack<>();
        St.push(8484);
        St.push(893);
        St.push(984);
        System.out.println(St.peek());
        System.out.println(St.pop());
        System.out.println("Stack Contain" + St);
    }
}