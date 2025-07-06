import java.util.Scanner;


public class TakinInput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Favouritte number");
        int n = sc.nextInt();
        System.out.println("Enter your name");
        String s = sc.next();
        System.out.println("Your name is "+ s);
        System.out.println("Your Favourit number is " + n);
    }
}
