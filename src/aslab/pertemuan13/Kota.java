package aslab.pertemuan13;

import java.util.Scanner;

public class Kota {
    public static void main(String[] args) {
        String[][] kota = new String[20][20];
        try (Scanner input = new Scanner(System.in)) {
            int i;

            System.out.print("Masukkan Jumlah Data : ");
            int jml = input.nextInt();
            for (i = 0; i < jml; i++) {
                System.out.println("Data ke " + (i + 1));
                System.out.print("Masukkan nama Kota : ");
                kota[i][i] = input.next();
            }
            System.out.println("\nNama - nama Kota ");
            for (i = 0; i < jml; i++) {
                System.out.print((i + ". "));
                System.out.println("Nama Kota : " + kota[i][i]);
            }
        }
    }
}
