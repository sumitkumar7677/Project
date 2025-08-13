public class NumberSum {
    public static void main(String args[]){
        int a = 12345,b = 0,c=0,d;
        d = a;
        while(a > 0){
            b = a % 10;
            c = c + b;
            a = a /10;
        }
        System.out.println("System.out.println" +d + "is" + c);
    }
}
