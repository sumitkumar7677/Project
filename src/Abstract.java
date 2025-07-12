abstract class Abstract {
    abstract void Car();
}
class func extends Abstract{
    void Car(){
        System.out.println("Car");
    }
}
class func2 extends Abstract{
    void Car(){
        System.out.println("This is Jeep Class");
    }
    public static void main(String[] args){
        func ab = new func();
            ab.Car();
        func2 ac = new func2();
            ac.Car();
    }
}
