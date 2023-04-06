package pbo.pertemuan5.Example;

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
        B obj = new B(); // object created (subclass)
        obj.name = "Inheritance";
        obj.solve(); // calling superclass method
        obj.solve2();
    }
}