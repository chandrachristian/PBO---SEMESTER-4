package pbo.pertemuan1;

import java.util.Scanner;

public class Week1InputOutput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan 1 : ");
        int number = input.nextInt();
        System.out.print("Masukkan Bilangan 2 : ");
        int number2 = input.nextInt();

        System.out.println("Anda Memasukkan");
        System.out.println("Angka 1 = " + number);
        System.out.println("Angka 2 = " + number2);

        input.close();
    }
}
