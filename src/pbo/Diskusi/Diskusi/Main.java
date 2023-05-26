package pbo.Diskusi.Diskusi;

// Abstrak class Hewan
abstract class Hewan {
    private String jenis;
    private String nama;

    // Constructor
    public Hewan(String jenis, String nama) {
        this.jenis = jenis;
        this.nama = nama;
    }

    // Method abstrak
    public abstract void suara();

    // Getter jenis
    public String getJenis() {
        return jenis;
    }

    // Setter jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}

// Subclass Anjing yang mewarisi Hewan
class Anjing extends Hewan {
    // Constructor
    public Anjing(String jenis, String nama) {
        super(jenis, nama);
    }

    // Implementasi method abstrak
    public void suara() {
        System.out.println("Guk guk!");
    }
}

// Subclass Kucing yang mewarisi Hewan
class Kucing extends Hewan {
    // Constructor
    public Kucing(String jenis, String nama) {
        super(jenis, nama);
    }

    // Implementasi method abstrak
    public void suara() {
        System.out.println("Meong meong!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Hewan anjing = new Anjing("Anjing", "Doggy");
        Hewan kucing = new Kucing("Kucing", "Kitty");

        // Polymorphism
        anjing.suara();
        kucing.suara();
    }
}
