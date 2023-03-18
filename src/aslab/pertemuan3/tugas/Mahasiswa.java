package aslab.pertemuan3.tugas;

class Mahasiswa {
    String nama;
    int umur;

    public void Membaca() {
        System.out.println(nama + "Membaca dari umur " + umur);
    }

    public void Menyontek() {
        System.out.println(nama + "Menjadi Mahasiswa Sejak umur " + umur);
    }

    public void Modifikasi() {
        System.out.println(nama + "Mampu memodifikasi Program sejak umur " + umur);
    }
}