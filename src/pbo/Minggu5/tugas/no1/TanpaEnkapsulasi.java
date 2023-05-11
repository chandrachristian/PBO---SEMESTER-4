package Minggu5.tugas.no1;

import java.util.Scanner;

class Kalkulator {
    int c;
    int d;
    String nama;

    void Pertambahan() {

        int hasilPertambahan = c + d;
        System.out.println("Pertambahan " + c + " + " + d + " = " + hasilPertambahan);
    }

    void Pengurangan() {

        int hasilPengurangan = c - d;
        System.out.println("Pengurangan " + c + " - " + d + " = " + hasilPengurangan);
    }

    int Perkalian(int c, int d) {
        int hasilPerkalian = c * d;
        System.out.println("Perkalian " + c + " * " + d + " = " + hasilPerkalian);
        return hasilPerkalian;
    }

    int Pembagian() {
        int hasilPembagian = c / d;
        System.out.println("Pembagian " + c + " / " + d + " = " + hasilPembagian);
        return hasilPembagian;
    }
}

public class TanpaEnkapsulasi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kalkulator obj = new Kalkulator();

        System.out.print("Masukkan nama anda : ");
        obj.nama = input.nextLine();

        System.out.println("Terima kasih sudah menggunakan Kalkulator ini " + obj.nama);

        System.out.print("Masukkan Angka 1 : ");
        obj.c = input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        obj.d = input.nextInt();

        obj.Pertambahan();
        obj.Pengurangan();
        obj.Perkalian(obj.c, obj.d);
        obj.Pembagian();

        input.close();
    }
}