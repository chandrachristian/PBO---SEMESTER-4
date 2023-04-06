package pbo.pertemuan5.tugas;

import java.util.Scanner;

class Kalkulator {
    private int a;
    private int b;
    String nama;

    // void hello(String nama) {
    // System.out.println("Selamat datang " + nama + " di Kalkulator Mandiri\n");
    // }

    void Pertambahan() {

        int hasilPertambahan = a + b;
        System.out.println("Pertambahan " + a + " + " + b + " = " + hasilPertambahan);
    }

    void Pengurangan() {

        int hasilPengurangan = a - b;
        System.out.println("Pengurangan " + a + " - " + b + " = " + hasilPengurangan);
    }

    int Perkalian(int a, int b) {
        int hasilPerkalian = a * b;
        System.out.print("Perkalian " + a + " * " + b + " = ");
        return hasilPerkalian;
    }

    int Pembagian() {
        int hasilPembagian = a / b;
        System.out.println("Pembagian " + a + " / " + b + " = " + hasilPembagian);
        return hasilPembagian;
    }
}

public class MainKalkulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kalkulator obj = new Kalkulator();

        System.out.print("Masukkan nama anda : ");
        obj.nama = input.nextLine();

        System.out.println("Terima kasih sudah menggunakan Kalkulator ini " + obj.nama);

        System.out.print("Masukkan Angka 1 : ");
        obj.a = input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        obj.b = input.nextInt();
        System.out.println();

        // obj.hello("Chandra");
        obj.Pertambahan();
        obj.Pengurangan();
        System.out.println(obj.Perkalian(obj.a, obj.b));
        obj.Pembagian();

        input.close();
    }
}