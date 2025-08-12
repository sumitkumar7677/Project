import java.util.*;
import java.lang.*;


class ThreadExp2 extends Thread  {
    public void run(){
        for (int i = 10; i >= 1; i--){
            System.out.println("Value of i = " + i);
            try{
                ThreadExp2.sleep(2000);
            }
            catch(Exception e){

            }
        }
    }

}
