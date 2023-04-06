package TugaKelompok.polymorphism;

class Perhitungann {

    double variabel(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    int variabel(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}

public class Overloading2 {
    public static void main(String[] args) {

        Perhitungann hitung = new Perhitungann();

        System.out.println(hitung.variabel(5.5, 7.5));
        System.out.println(hitung.variabel(10, 20));
    }
}