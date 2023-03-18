package aslab.pertemuan3.contoh;

public class SepedaAksi {
    public static void main(String[] args) {
        // Membuat object
        Sepeda sepedaku = new Sepeda();
        /* memanggil atribut dan memberi nilai */
        sepedaku.warna = "Hitam";
        sepedaku.tahunProduksi = 2006;
        System.out.println("Kring-kring Sepedaku...");
        System.out.println("Sepedaku berwarna : " + sepedaku.warna);
        System.out.println("Diproduksi tahun : " + sepedaku.tahunProduksi);

    }
}
