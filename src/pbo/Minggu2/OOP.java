package Minggu2;

import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        var nilai = input.nextLine();

        String ucapan = switch (nilai) {
            case "A":
                yield "Anda Lulus";
            case "B", "C":
                yield "Anda Lulus Baik";
            case "D":
                yield "Anda Lulus Cukup Baik";
            default:
                yield "Anda Salah jurusan";
        };
        System.out.println(ucapan);
        input.close();
    }
}