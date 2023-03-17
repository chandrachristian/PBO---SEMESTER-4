package pbo.pertemuan2;

import java.util.Scanner;

public class ChallengeNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        var name = input.nextLine();
        System.out.print("Masukkan Final Exam : ");
        var fExam = input.nextInt();
        System.out.print("Masukkan Middle Exam : ");
        var mExam = input.nextInt();
        System.out.print("Masukkan Nilai Tugas : ");
        var aTugas = input.nextInt();

        int sumValue = (int) ((fExam * 0.4) + (mExam * 0.35) + (aTugas * 0.25));
        String huruf = "A";
        // A
        if (sumValue >= 85 && sumValue < 100) {
            huruf = "A";
        } // A-
        else if (sumValue >= 80 && sumValue < 85) {
            huruf = "A-";
        } // B+
        else if (sumValue >= 75 && sumValue < 80) {
            huruf = "B+";
        } // B
        else if (sumValue >= 70 && sumValue < 75) {
            huruf = "B";
        } // B-
        else if (sumValue >= 65 && sumValue < 70) {
            huruf = "B-";
        } // C+
        else if (sumValue >= 60 && sumValue < 65) {
            huruf = "C+";
        } // C
        else if (sumValue >= 50 && sumValue < 60) {
            huruf = "C";
        } // D
        else if (sumValue >= 40 && sumValue < 50) {
            huruf = "D";
        } // E
        else if (sumValue >= 0 && sumValue < 40) {
            huruf = "E";
        }

        System.out.println("Selamat " + name + " Total Nilai " + sumValue + " " + huruf);
        input.close();
    }
}