import java.util.*;

public class Collection_3 {
    public static void main(String[] args) {
        // Using ArrayList as the collection
        List<String> col = new ArrayList<>();
        col.add("a");
        col.add("b");

        // Print size of collection
        System.out.println(col.size());
        System.out.println(Capacity(col));

    }
    public static int Capacity(List<String> col) {
        return col.size();

    }
    public static int getElement(List<Integer> col, int index){
        if index >= 0 && index < col.size()
    }


}
