public class Reverse {
    public static void main(String [] args){
        int a[] = {10,20,20,40,39};
        for(int i = 0; i<a.length ; i++){

            System.out.println("Revers of A iss "+ a[i] + " ");
        }
        float sum = 0, ans;
        for(int i = 0; i< a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Average"+ sum/a.length);
    }
}
