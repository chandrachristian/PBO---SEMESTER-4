package TugasKelompok4.polymorphism;

// POLIMORPISME MENGGUNAKAN INHERITANCE
class Hewan {
    String nama = "class Hewan";
    
    void display1() {
        System.out.println("Ini adalah " + this.nama);
    }
    void display2() {
        System.out.println("Hewan adalah superclass");
    }
}

class Harimau extends Hewan {
    String nama = "class Harimau";

    @Override
    void display1() {
        System.out.println("\nIni adalah " + this.nama);
        this.display2();
    }
    @Override
    void display2() {
        System.out.println("Harimau adalah subclass\n");
    }
    void displaySuper() {
        System.out.println("Ini adalah " + super.nama);
        super.display2();
    }
}

public class OverridingInheritance {
    public static void main(String[] args) {
        Harimau hewan = new Harimau();
        
        hewan.display1();
        hewan.displaySuper();
    }
}