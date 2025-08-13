public class Armstrong {
    public static void main(String args[]) {
        int n = 153; // input value
        int original = n;
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }

        if (original == sum) {
            System.out.println("Given number is an Armstrong number: " + original);
        } else {
            System.out.println("Given number is not an Armstrong number: " + original);
        }
    }
}
