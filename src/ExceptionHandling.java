import java.util.*;
import java.io.FileReader;
public class ExceptionHandling {
    public static void main(String [] args){
        System.out.println("My name is Sumit");
        try
        {
            System.out.println(4/0);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally Inside");
        }
        System.out.println("Exception Crosss");
    }
}
