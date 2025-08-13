import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        System.out.println("Welcome to State Bank of India");
        System.out.println("Select language :");
        System.out.println("1. English");
        System.out.println("2. Hindi");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1 ){
            System.out.println("English Selected");
        }
        else if(a ==2){
            System.out.println("Hindi Selectedd");
        }
        else{
            System.out.println("Invalid Language Selected");
        }
        System.out.println("Please Select :");
        
        System.out.println("1. Balance Enquiry");
        System.out.println("2. Withdrawal");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exitt");
    }
}
