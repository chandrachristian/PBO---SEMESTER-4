package Minggu5.Example;

class A {
    protected String name; // protected member field

    protected void solve() { // protected method
        System.out.println("Superclass method");
    }
}

class B extends A {
    void solve2() {
        System.out.println("Name: " + name); // accessing name value from superclass
    }
}

public class Main2 {
    public static void main(String[] args) {
        B objek = new B(); // objekect created (subclass)
        objek.name = "Inheritance";
        objek.solve(); // calling superclass method
        objek.solve2();
    }
}