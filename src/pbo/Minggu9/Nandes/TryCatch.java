package pbo.Minggu9.Nandes;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        // menggunakan exception (try-catch)
        int[] array = {0, 1, 2, 3};

        Scanner userInput = new Scanner (System.in);
        System.out.print("Nilai array ke: ");
        
        try{
            int index = userInput.nextInt();
            System.out.println("Index ke-" + index + " adalah " + array[index]);
        } catch (ArrayIndexOutOfBoundsException exception_message) {
            System.out.println("Index yang Anda masukkan tidak sesuai dengan jumlah array");
        }
        
        // tetap dieksekusi meskipun error
        System.out.println("End of program");

        userInput.close();
    }
}

