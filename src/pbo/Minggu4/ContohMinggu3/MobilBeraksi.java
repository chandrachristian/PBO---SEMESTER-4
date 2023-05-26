package pbo.Minggu4.ContohMinggu3;

/**
 * InnerMobilBeraksi
 */
class Mobil {
    String warna;
    int tahunProduksi;
    int ban;

    void hello() {
        System.out.println("Hello");
    }

    void hello2(String nama) {
        System.out.println("Hello " + nama);
    }

    void kapasitasMobil(int berat) {
        System.out.println("Berat Mobil Maksimal " + berat + "Kg");
    }

    void jumlahKursi() {
        System.out.println("5 Kursi");
    }

    int jumlahBan(int a) {
        int kembali = a + 100;
        return kembali;
    }

    int jumlahBanBiasa() {
        int seluruh = 1 + ban;
        return seluruh;
    }
}

public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        Mobil mobilmu = new Mobil();

        mobilmu.kapasitasMobil(200);
        mobilku.jumlahKursi();

        mobilku.warna = "Black";
        mobilku.tahunProduksi = 2006;
        mobilku.ban = 4;

        mobilmu.warna = "White";
        mobilmu.tahunProduksi = 2022;
        mobilmu.ban = 10;

        System.out.print("Warna Mobilku " + mobilku.warna);
        System.out.println(" dan Tahun produksi " + mobilku.tahunProduksi);
        System.out.println("Terdapat " + mobilku.ban + " Ban");
        System.out.println("jumlah ban seluruhnya " + mobilku.jumlahBanBiasa());

        System.out.print("Warna Mobilku " + mobilmu.warna);
        System.out.println(" dan Tahun produksi " + mobilmu.tahunProduksi);
        System.out.println("Terdapat " + mobilmu.ban + " Ban");
        System.out.println("jumlah ban seluruhnya " + mobilmu.jumlahBanBiasa());

    }
}
