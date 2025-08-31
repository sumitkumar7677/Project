
@FunctionalInterface
interface Func{
    int sum(int a , int b);
}
public class LamExp2 {
    public static void main(String[] args) {
        Func newFun = (a,b) -> (a+b);
        System.out.println("Sum of a and b is :" + newFun.sum (6,4));
    }
}
