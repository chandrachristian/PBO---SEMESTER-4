package pbo.pertemuan5.tugas;

class Kalkulator {
    private int a;
    private int b;
    String nama;

    // void hello(String nama) {
    // System.out.println("Selamat datang " + nama + " di Kalkulator Mandiri\n");
    // }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    void Pertambahan() {

        int hasilPertambahan = a + b;
        System.out.println("Pertambahan " + a + " + " + b + " = " + hasilPertambahan);
    }

    void Pengurangan() {

        int hasilPengurangan = a - b;
        System.out.println("Pengurangan " + a + " - " + b + " = " + hasilPengurangan);
    }

    int Perkalian(int a, int b) {
        int hasilPerkalian = a * b;
        System.out.print("Perkalian " + a + " * " + b + " = ");
        return hasilPerkalian;
    }

    int Pembagian() {
        int hasilPembagian = a / b;
        System.out.println("Pembagian " + a + " / " + b + " = " + hasilPembagian);
        return hasilPembagian;
    }
}

public class KalkulatorKeren {

    public static void main(String[] args) {

        Kalkulator obj = new Kalkulator();

        obj.setA(10);
        obj.setB(20);

        obj.Pertambahan();
        obj.Pengurangan();
        obj.Perkalian(10, 20);
        obj.Pembagian();

    }
}
