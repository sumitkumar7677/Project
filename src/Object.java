public class Object {
    public void methodEx(){
        System.out.println("This is method call");
    }
    public static void main(String [] args){
        System.out.println("This is innerr COde");
        Object NewObject = new Object();
        NewObject.methodEx();
    }
}
