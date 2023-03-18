package aslab.pertemuan3.tugas;

public class Nilai {
    int nim, absen, tugas, uts, uas, akhir;
    String nama;

    int Absen() {
        double hasil = absen * 0.1;
        return (int) hasil;
    }

    int Tugas() {
        double hasil = tugas * 0.2;
        return (int) hasil;
    }

    int Uts() {
        double hasil = uts * 0.3;
        return (int) hasil;
    }

    int Uas() {
        double hasil = uas * 0.4;
        return (int) hasil;
    }

    int akhir() {
        double hasil = Absen() + Tugas() + Uts() + Uas();
        return (int) hasil;
    }

    void CetakNilai() {
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nilai Absen\t: " + Absen());
        System.out.println("Nilai Tugas\t: " + Tugas());
        System.out.println("Nilai UTS\t: " + Uts());
        System.out.println("Nilai UAS\t: " + Uas());
        System.out.println("Nilai AKHIR\t: " + akhir());
    }
}
