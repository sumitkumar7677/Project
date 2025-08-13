import java.util.*;
import java.lang.*;

class ThreadExp implements Runnable {
    public void run(){
        for (int i = 0; i <= 10; i++){
            System.out.println("Value of I is : " + i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
    public static void main (String[] args){
        ThreadExp Te = new ThreadExp();
        Thread tm = new Thread(Te);
        ThreadExp2 t3 =new ThreadExp2();


        tm.start();
        t3.start();
    }
}
