package Minggu5.tugas.no2;

class Kalkulator {
    private int a;
    private int b;

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
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
        System.out.println("Perkalian " + a + " * " + b + " = " + hasilPerkalian);
        return hasilPerkalian;
    }

    int Pembagian() {
        int hasilPembagian = a / b;
        System.out.println("Pembagian " + a + " / " + b + " = " + hasilPembagian);
        return hasilPembagian;
    }
}

public class Enkapsulasi {

    public static void main(String[] args) {

        Kalkulator obj = new Kalkulator();

        obj.setA(20);
        obj.setB(20);

        obj.Pertambahan();
        obj.Pengurangan();
        obj.Perkalian(obj.getA(), obj.getB());
        obj.Pembagian();

    }
}
