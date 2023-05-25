package pbo.Minggu9.Nandes;

public class Throws {

    public static void main(String[] args) {
        try {
            int hasil = bagi(10, 2);
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    public static int bagi(int pembilang, int penyebut) throws ArithmeticException {
        int hasil;
        if (penyebut == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        } else {
            hasil = pembilang / penyebut;
        }
        return hasil;
    }
}