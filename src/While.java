import java.util.Scanner;
public class While {
    public static void main(String [] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int  sum = 0;
      int num  =1;
      while (num  <= n){
          sum = sum + num;
          num++;
      }
      System.out.println("Sum of first number is "+ sum);

    }
}
