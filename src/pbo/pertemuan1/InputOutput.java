package pbo.pertemuan1;

import java.util.Scanner;

class InputOutput {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Bilangan " + number + " Adalah Genap");
        } else {
            System.out.println("Bilangan " + number + " Adalah Ganjil");
        }

        // closing the scanner object
        input.close();
    }
}