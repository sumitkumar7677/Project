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

        Set<Integer> st = new HashSet<>();
        st.add(39);
        st.add(394455);
        st.add(349);
        st.add(324459);
        System.out.println(st);


        Set<Integer> st2 = new LinkedHashSet<>();
        st2.add(8393);
        st2.add(84);
        st2.add(84);
        st2.add(8643);
        System.out.println(st2);


    }
}