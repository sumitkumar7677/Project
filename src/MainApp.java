public class MainApp
{
    int no = 100;   //instance variable

    static int sno = 200;   //static variable

    void m1()
    {
        int no1 = 10;   //local variable
        System.out.println("Result 1 : "+(no1 + no));
        System.out.println("Result 2 : "+(no1 + no + sno));
        //System.out.println("Result 3 : "+(no1 + no2));    //error as no2 is local variable which is present in m2() method and thus cannot be used outside m2() method
    }

    void m2()
    {
        int no2 = 20;   //local variable
        System.out.println("Result 4 : "+(no2 + no));
        System.out.println("Result 5 ::: "+(no2 + no + sno));
        //System.out.println("Result 6 : "+(no2 + no1));    //error as no1 is local variable which is present in m1() method and thus cannot be used outside m1() method
    }

    static void m3()
    {
        int no3 = 30;   //local variable
        //System.out.println("Result 7 : "+(no3 + no)); //error because no is instance variable which cannot be used inside static method
        System.out.println("Result 8 : "+(no3 + sno));
        System.out.println("Result 9 : "+( no3));    //error because no1 and no2 are local variables and cannot be used outside their method scope
    }

    public static void main(String[] args)
    {
        MainApp obj = new MainApp();
        obj.m1();
        obj.m2();

        MainApp.m3();  //static method can be directly called by class name
    }
}