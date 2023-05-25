package pbo.Minggu9.Nandes;

import java.util.Scanner;

public class TanpaException {
    public static void main(String[] args) {
        // tanpa menggunakan exception 
        int[] array = {0, 1, 2, 3};

        Scanner userInput = new Scanner (System.in);
        System.out.print("Nilai array ke: ");
        int index = userInput.nextInt();
        System.out.println("Index ke-" + index + " adalah " + array[index]);

        // tidak akan dieksekusi jika error
        System.out.println("End of program");

        userInput.close();
    }
}
