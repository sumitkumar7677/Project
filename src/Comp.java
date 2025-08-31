import java.util.*;
class Comp{
    public static void main(String [] args){
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(49);
        l.add(84);
        l.add(43);
        l.add(65);
        l.add(532);
        System.out.println(l);
        Comparator<Integer> c = (I1,I2) ->(I1 < I2)? -1: (I1 > I2) ? 1:0;
        Collections.sort(l,c);
        System.out.println(l);


    }
}