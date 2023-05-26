package pbo.Minggu2;

import java.util.Scanner;

public class Selection {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int number = input.nextInt();
        System.out.println("you entered " + number);

        if (number > 0) {
            System.out.println("positive number");
        } else if (number < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("zero number");
        }
        input.close();
    }
}
