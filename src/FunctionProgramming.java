import java.util.Scanner;

public class FunctionProgramming {
    static class Calculate{

        static int Cal(cls cl ,int a,int b) {
            return cl.calculate(a,b);
        }
    }
    static class cls {
        int  calculate(int a, int b){
            return a+b;
        }
    }
    public static void main(String [] args){
        cls calc = new cls();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int c = sc.nextInt();
        System.out.println("Enter the Value of B");
        int d = sc.nextInt();
        int result = calc.calculate(c,d);
        System.out.println("Output is "+ result);
    }
}
