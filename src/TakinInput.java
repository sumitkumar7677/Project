import java.util.Scanner;
public class TakinInput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Favourite number");
        int n = sc.nextInt();
        sc.nextLine(); // ✅ Consume the leftover newline

        System.out.println("Your Favourite number is " + n);

        System.out.println("Enter your full name");
        String a = sc.nextLine();  // ✅ Now it will correctly read full name
        System.out.println("Your Full name is " + a);

        System.out.println("Enter your name (single word)");
        String s = sc.next(); // This still reads only one word
        System.out.println("Your name is "+ s);
    }
}
