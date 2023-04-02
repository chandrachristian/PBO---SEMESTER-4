package pbo.pertemuan5.tugas;

class Kalkulator2 {
    int number1 = 30;
    int number2 = 5;

    void penjumlahan() {
        int a = number1 + number2;
        System.out.println("Hasil penjumlahan dari " + number1 + " + " + number2 + " Adalah " + a);
    }

    void pengurangan() {
        int a = number1 - number2;
        System.out.println("Hasil pengurangan dari " + number1 + " - " + number2 + " Adalah " + a);
    }

    int perkalian(int b, int c) {
        int a = b * c;
        System.out.print("Hasil pengurangan dari " + b + " - " + c + " Adalah ");
        return a;
    }

    int pembagian() {
        int a = number1 / number2;
        System.out.println("Hasil pengurangan dari " + number1 + " - " + number2 + " Adalah " + a);
        return a;
    }
}

public class KalkulatorFInal {
    public static void main(String[] args) {

        Kalkulator2 inez = new Kalkulator2();

        inez.penjumlahan();
        inez.pengurangan();
        System.out.println(inez.perkalian(30, 5));
        inez.pembagian();
    }
}
