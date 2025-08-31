import java.lang.reflect.Array;
import java.util.*;

class test {
    String name;
    int number;

    test(int number, String name){
        this.number = number;
        this.name = name;
    }
    public String toString()
    {
        return name + ":" + number;
    }
}
class StringPass{
    public static void main(String [] args){
        ArrayList<test> l = new ArrayList<>();
        l.add(new test(123,"Sumit Singh"));
        l.add(new test(183,"Sumit"));
        l.add(new test(143,"Sumit Kumar"));
        System.out.println(l);
//        Collections.sort(l,(e1,e2) -> (e1.number > e2.number)?-1:(e1.number > e2.number)?1:0);
        Collections.sort(l,(e1,e2)-> e1.name.compareTo(e2.name));
        System.out.println(l);

    }
}
