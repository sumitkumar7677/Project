import java.util.Scanner;


public class TakinInput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Favouritte number");
        int n = sc.nextInt();
        System.out.println("Your Favourit number is " + n);
        System.out.println("Enter your name");
        String s = sc.next(); //This will ignore after space
        System.out.println("Your name is "+ s);
        System.out.println("Enter your full name");
        String a = sc.nextLine();
        System.out.println("Your Full name is " + a);
    }
}
