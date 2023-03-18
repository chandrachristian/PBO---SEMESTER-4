package aslab.pertemuan3.contoh;

public class Matematika {
    int a, b;

    int tambah() {
        int hasil = a + b;
        return hasil;
    }

    void info() {
        System.out.println("Penambahan " + a + " + " + b + " = " + tambah());
    }
}
