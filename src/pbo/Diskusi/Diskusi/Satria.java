package pbo.Diskusi.Diskusi;

// Abstrak class kendaraan
abstract class Kendaraan {
    private String merek;
    private String warna;

    // Constructor
    public Kendaraan(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    // Method abstrak
    public abstract void tampilkanInfo();

    // Getter merek
    public String getMerek() {
        return merek;
    }

    // Setter merek
    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Getter warna
    public String getWarna() {
        return warna;
    }

    // Setter warna
    public void setWarna(String warna) {
        this.warna = warna;
    }
}

// Subclass mobil yang mewarisi Kendaraan
class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Constructor
    public Mobil(String merek, String warna, int jumlahPintu) {
        super(merek, warna);
        this.jumlahPintu = jumlahPintu;
    }

    // Implementasi method abstrak
    public void tampilkanInfo() {
        System.out.println("Mobil");
        System.out.println("Merek: " + getMerek());
        System.out.println("Warna: " + getWarna());
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Subclass sepedaMotor yang mewarisi Kendaraan
class SepedaMotor extends Kendaraan {
    private boolean adaBoncengan;

    // Constructor
    public SepedaMotor(String merek, String warna, boolean adaBoncengan) {
        super(merek, warna);
        this.adaBoncengan = adaBoncengan;
    }

    // Implementasi method abstrak
    public void tampilkanInfo() {
        System.out.println("Sepeda Motor");
        System.out.println("Merek: " + getMerek());
        System.out.println("Warna: " + getWarna());
        System.out.println("Ada Boncengan: " + adaBoncengan);
    }
}

// Main class
public class Satria {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota", "Hitam", 4);
        Kendaraan sepedaMotor = new SepedaMotor("Honda", "Merah", true);

        // Polymorphism
        mobil.tampilkanInfo();
        System.out.println("----------");
        sepedaMotor.tampilkanInfo();
    }
}
