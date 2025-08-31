import java.util.*;

class myComparator implements Comparator<Integer>{
    public int compare(Integer I1, Integer I2) {
        if (I1 < I2) {
            return -1;
        } else if (I1 > I2) {
            return +1;
        } else {
            return 0;
        }
    }
}
class Comp{
    public static void main(String [] args){
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(49);
        l.add(84);
        l.add(43);
        l.add(65);
        l.add(532);
        System.out.println(l);
        Collections.sort(l,new myComparator());
        System.out.println(l);
    }
}