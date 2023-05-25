package pbo.TugasKelompok4.polymorphism;

class Perhitungan {

    public int variabel(int a, int b) {
        return a + b;
    }

    public int variabel(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading1 {
    public static void main(String[] args) {

        Perhitungan hitung = new Perhitungan();
        System.out.println("\nHasil pertambahan 2 angka: " + hitung.variabel(35, 55));
        System.out.println("Hasil pertambahan 3 angka: " + hitung.variabel(15, 25, 40));
    }
}