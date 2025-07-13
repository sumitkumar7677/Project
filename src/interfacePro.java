interface a {
    void fun(); // interface method
}

class interfacePro implements a {
    // implementing the interface method
    public void fun() {
        System.out.println("fun() method implemented in interPro class");
    }

    public static void main(String[] args) {
        interfacePro obj = new interfacePro();
        obj.fun();  // calling the implemented method
    }
}
