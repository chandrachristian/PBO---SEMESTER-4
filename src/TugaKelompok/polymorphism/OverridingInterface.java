package TugaKelompok.polymorphism;

// POLIMORPISME MENGGUNAKAN INTERFACE
interface BangunDatar {
    double hitungLuas();
}

class Persegi implements BangunDatar {
    private double s;
    
    public Persegi(double s) {
        this.s = s;
    }
    @Override
    public double hitungLuas() {
        return s * s;
    }
}

class Lingkaran implements BangunDatar {
    private double r;
    
    public Lingkaran(double r) {
        this.r = r;
    }
    @Override
    public double hitungLuas() {
        return 3.14 * r * r;
    }
}

public class OverridingInterface {
    public static void main(String[] args) {
        Persegi square = new Persegi(5);
        Lingkaran circle = new Lingkaran(7);
        
        System.out.println("\nLuas persegi = " + square.hitungLuas());
        System.out.println("Luas lingkaran = " + circle.hitungLuas());
    }
}