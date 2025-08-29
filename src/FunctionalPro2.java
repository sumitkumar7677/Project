import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;



public class FunctionalPro2 {
    public static void main(String [] args){
        Function<Integer,Integer> f = i -> i*i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value you want to find Square Root ");
        int num = sc.nextInt();
        System.out.println("Square Root offd "+ num+ " is "+ f.apply(num));


        Predicate<Integer> p = i-> i%2==0;
        int i = num;
        System.out.println(" Even or Odd " + p.test(i));

    }
}
