import java.util.Scanner;
import java.util.function.*;

public class PredicateExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Stirngg to Check : ");
        String a = sc.nextLine();

        Predicate<String> P1 = i->(a.length()>5);
        System.out.println(P1.test(a));

    }
}

