package pbo.pertemuan2;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan dijumlahkan = ");
        var nilai = input.nextInt();

        var sum = 0;
        for (int i = 2; i <= nilai; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("perhitungan dari " + nilai + " adalah " + sum);
        input.close();
    }
}