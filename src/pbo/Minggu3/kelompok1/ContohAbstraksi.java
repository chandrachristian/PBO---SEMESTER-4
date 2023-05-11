package Minggu3.kelompok1;

abstract class Bentuk {
    protected int x, y;

    public Bentuk(int x, int y) {
        this.x = x;
        this.y = y;

    }

    abstract void gambar();
}

class Lingkaran extends Bentuk {
    int radius;

    public Lingkaran(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    void gambar() {
        System.out.println("Menggambar lingkaran di (" + x + "," + y + ")");
    }
}

class Kotak extends Bentuk {
    private int panjang, lebar;

    public Kotak(int x, int y, int panjang, int lebar) {
        super(x, y);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void gambar() {
        System.out.println("Menggambar kotak di (" + x + ", " + y + ") dengan panjang" + panjang + "dan lebar" + lebar);
    }
}

public class ContohAbstraksi {
    public static void main(String[] args) {
        Bentuk bentuk1 = new Lingkaran(10, 20, 5);
        Bentuk bentuk2 = new Kotak(30, 40, 10, 20);
        bentuk1.gambar();
        bentuk2.gambar();
    }
}