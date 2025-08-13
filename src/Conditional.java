import java.util.Scanner;
public class Conditional {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int a = s.nextInt();
        if(a > 18 && a < 30){
            System.out.println("You are in Teen Age");
        }
        else
            if(a > 30 && a < 60 ){
                System.out.println("You are an adult");
            }
            else
                System.out.println("You are under age");
    }
}
