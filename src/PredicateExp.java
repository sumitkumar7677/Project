import java.util.Scanner;
import java.util.function.*;

public class PredicateExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number to Check : ");
        int a = sc.nextInt();

        Predicate<Integer> P1 = i->(a%2==0);
        System.out.println(P1.test(a));

    }
}

