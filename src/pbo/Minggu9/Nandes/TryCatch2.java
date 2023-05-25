package pbo.Minggu9.Nandes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        // exception lebih dari satu
        int[] array = {0, 1, 2, 3};

        Scanner userInput = new Scanner(System.in);

        System.out.print("Nilai array ke: ");
        
        try {
            int index = userInput.nextInt();
            System.out.println("Index ke-" + index + " adalah " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index yang Anda masukkan tidak sesuai dengan jumlah array");
        } catch (InputMismatchException e) {
            System.out.println("Input yang Anda masukkan tidak valid");
        } 

        System.out.println("End of program");

        userInput.close();
    }
}
