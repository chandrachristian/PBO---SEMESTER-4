package pbo.pertemuan5.Example;

class SuperClass1 {
    void methodSuper() {
        System.out.println("I am a super class method");
    }
}

// Inhertiting SuperClass to Subclass
class SubClass1 extends SuperClass1 {
    public void methodSubclass() {
        System.out.println("I am a subclass method");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        SubClass1 obj = new SubClass1();
        obj.methodSuper();
        obj.methodSubclass();
    }
}