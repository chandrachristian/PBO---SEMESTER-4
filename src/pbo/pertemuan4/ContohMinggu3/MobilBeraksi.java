package pbo.pertemuan4.ContohMinggu3;

/**
 * InnerMobilBeraksi
 */
class Mobil {
    String warna;
    int tahunProduksi;

}

public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        Mobil mobilmu = new Mobil();

        mobilku.warna = "Black";
        mobilku.tahunProduksi = 2006;

        mobilmu.warna = "White";
        mobilmu.tahunProduksi = 2022;

        System.out.print("Warna Mobilku " + mobilku.warna);
        System.out.println(" dan Tahun produksi " + mobilku.tahunProduksi);

        System.out.print("Warna Mobilku " + mobilmu.warna);
        System.out.println(" dan Tahun produksi " + mobilmu.tahunProduksi);
    }
}
