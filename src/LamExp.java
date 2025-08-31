@FunctionalInterface
interface MyFunction {
    int add(int a, int b);
}

public class LamExp {
    public static void main(String[] args) {
        // Lambda expression to implement add()
        MyFunction sum = (a, b) -> a + b;

        // Use it
        System.out.println("5 + 3 = " + sum.add(5, 3));
    }
}
