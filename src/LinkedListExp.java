import java.util.LinkedList;
import java.util.*;

public class LinkedListExp {
    public static void main(String [] args){
        LinkedList<Integer> l_list = new LinkedList<Integer>();
        l_list.add(49);
        l_list.add(56);
        l_list.add(66);
        l_list.add(545);
        l_list.add(444);

        int list2 = 0;
        for (int i = 0 ; i < l_list.size(); i++){
            list2 = list2 + l_list.get(i);
        }
        System.out.println("Sum of all the element in LinkedList " + list2);
    }
}
