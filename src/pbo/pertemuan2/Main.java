package pbo.pertemuan2;

public class Main {
    public static void main(String[] args) {
        // Tetapkan daftar bilangan ke variable numbers
        int[] numbers = { 1, 4, 6, 9, 13, 16 };
        int oddSum = 0;
        int evenSum = 0;

        // Kalkulasikan jumlah bilangan ganjil dan jumlah bilangan genap
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += 1;
            } else {
                oddSum += 1;
            }
        }
        System.out.println("Jumlah bilangan ganjil: " + oddSum);
        System.out.println("Jumlah bilangan genap: " + evenSum);
    }
}
