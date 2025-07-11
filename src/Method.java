public class Method{
    void a(int a){
        System.out.println("First is first methods");
    }
    void b () {
        System.out.println("This is second method");
    }
    public static void main(String [] args){
        System.out.println("This main class ");
        Method M = new Method();
        M.a(20);
        M.b();
    }
}