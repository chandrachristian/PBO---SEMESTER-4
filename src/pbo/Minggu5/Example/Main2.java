package pbo.Minggu5.Example;

class Chandra {
    protected String name; // protected member field

    protected void solve() { // protected method
        System.out.println("Superclass method");
    }
}

class B extends Chandra {
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