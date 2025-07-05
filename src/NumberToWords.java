public class NumberToWords {

    public void pw(int n, String ch) {
        String one[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

        String ten[] = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
                "Eighty", "Ninety" };

        if (n > 19) {
            System.out.print(ten[n / 10] + " " + one[n % 10]);
        } else {
            System.out.print(one[n]);
        }

        if (n != 0) {
            System.out.print(" " + ch + " ");
        }
    }

    public static void main(String[] args) {
        int n = 28;

        if (n <= 0) {
            System.out.println("Enter numbers greater than 0");
            return;
        }

        NumberToWords a = new NumberToWords();

        a.pw((n / 1000000000), "Billion");
        a.pw((n / 10000000) % 100, "Crore");
        a.pw((n / 100000) % 100, "Lakh");
        a.pw((n / 1000) % 100, "Thousand");
        a.pw((n / 100) % 10, "Hundred");

        if ((n % 100) > 0 && n > 100) {
            System.out.print("and ");
        }

        a.pw((n % 100), "");
    }
}
