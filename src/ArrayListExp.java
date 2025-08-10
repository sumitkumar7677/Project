import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExp {
    public static void  main (String [] args){
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        Arr.add(10);
        Arr.add(50);
        Arr.remove(1);
        Arr.add(44);
        System.out.println(Arr);
        int Sum_total = 0;
        for (int i = 0 ; i < Arr.size(); i++){
            Sum_total = Sum_total + Arr.get(i);
            System.out.println("Sum of Total Arr Value is " + Sum_total);
        }
    }
}
