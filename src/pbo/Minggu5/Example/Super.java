package pbo.Minggu5.Example;

class Christian {
    int i = 200;

    void solve() {
        System.out.println("superclass method");
    }
}

class B extends Christian {
    int i = 100;

    void solve() { // overriding method - solve()
        super.solve();
        System.out.println("subclass method");
        System.out.println("Value of i in subclass");
        System.out.println("Value of i in superclass: " + super.i); // accessing value of i in superclass
    }
}

public class Super {
    public static void main(String[] args) {
        B obj = new B(); // object created (subclass)
        obj.solve();
    }
}