import java.util.*;
import java.util.List;

public class Collection_1 {
    public static void main(String[] args){
        Bike MyBike = new Bike();
        Order Orders = new Order(6);

    }
}
class Bike{
     Bike(){
         System.out.println("Bike Created");
     }
}

class Order{
      Order(int items) {
         for (int i = 0; i <= items; i++) {
             System.out.println("My Second Bike Created");
         }
     }

}