package pbo.Minggu9.Nandes;

import java.util.Scanner;

public class Finally {
        public static void main(String[] args) {
        // finally
        int[] array = {0, 1, 2, 3};

        Scanner userInput = new Scanner (System.in);
        System.out.print("Nilai array ke: ");
        
        try{
            int index = userInput.nextInt();
            System.out.println("Index ke-" + index + " adalah " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index yang Anda masukkan tidak sesuai dengan jumlah array");
        } finally { // dieksekusi jika try & catch SUDAH dieksekusi
            System.out.println("Finally!");
        }
        

        // tetap dieksekusi meskipun error
        System.out.println("End of program");

        userInput.close();
    }
}
