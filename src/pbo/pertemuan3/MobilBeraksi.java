package pbo.pertemuan3;

public class MobilBeraksi {
    public static void main(String[] args) {
        // Membuat Object
        String warna = "Merah";
        Mobil mobilku = new Mobil();

        /* memanggil atribut dan memberi nilai */
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        System.out.println("Warna " + mobilku.warna);
        System.out.println("Warna " + warna);
        System.out.println("Tahun " + mobilku.tahunProduksi);
    }
}
