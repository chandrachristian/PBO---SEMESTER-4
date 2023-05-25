package pbo.Minggu9.Nandes;

public class Throw {
    public static void main(String[] args) {
        try {
            bagiAngka(10, 2);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    public static void bagiAngka(int pembilang, int penyebut) {
        if (penyebut == 0) {
            throw new ArithmeticException("Pembaginya tidak boleh nol brooo!");
        }

        int hasil = pembilang / penyebut;
        System.out.println("Hasil pembagian: " + hasil);
    }
}