import java.util.Scanner;
public class Add {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of entered numberr is :"+ sum);

    }
}
