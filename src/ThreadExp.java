import java.util.*;
import java.lang.*;

class ThreadExp implements Runnable {
    public void run(){
        for (int i = 0; i <= 10; i++){
            System.out.println("Value of I is : " + i);
        }
    }
    public static void main (String[] args){
        ThreadExp Te = new ThreadExp();
        Thread tm = new Thread(Te);
        tm.run();
    }
}
