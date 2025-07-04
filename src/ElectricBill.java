public class ElectricBill {
    public static void main (String arg[]){
        int i = 500;
        int charge = 1;
        if(i > 100)
        {
            if(i >= 200)
            {
                if(i >= 300)
                {
                     charge = i * 6;
                }
                else
                    charge = i * 8;
            }
            else
                charge = i * 9;
        }
        else
            charge = i * 5;
        System.out.println("Total Bill "+ charge);
    }
}
