package pbo.Minggu5.Example;

class A {
    String name;

    public void getName(String str) {
        System.out.println("I am " + str);
    }
}

class B extends A {
    public void display() {
        System.out.println("I am derived from class A " + name);
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.name = "Inheritance";
        obj.display();
        obj.getName("Learning");
    }
}