public class DigitsSum
{
    public static void main(String[] args)
    {
        int num=25104, rem = 0, sum = 0, temp;
        temp = num;
        while (num > 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.print("Sum of Digits of " + temp + " is " + sum);
    }
}