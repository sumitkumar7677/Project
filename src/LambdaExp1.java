import java.util.Scanner;

public class LambdaExp1 {
    interface AO{
        void calculate(int a ,int b);
    }
    class Calc{
        static void calculate(AO ao){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of A :");
            int a = sc.nextInt();
            System.out.println("Enter the value of B :");
            int b = sc.nextInt();
            ao.calculate(a,b);
        }
    }

    public static void main(String[] args) {
        Calc.calculate((int a,int b) -> System.out.println("Sum of A and B is :" + (a+b)));
    }
}
